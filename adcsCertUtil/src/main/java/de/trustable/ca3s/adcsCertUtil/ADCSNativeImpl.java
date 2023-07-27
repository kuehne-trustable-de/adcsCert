package de.trustable.ca3s.adcsCertUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jna.platform.win32.Ole32;
import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.Factory;

import de.trustable.ca3s.adcsCertAdmin.CCertAdmin;
import de.trustable.ca3s.adcsCertAdmin.CCertView;
import de.trustable.ca3s.adcsCertAdmin.IEnumCERTVIEWCOLUMN;
import de.trustable.ca3s.adcsCertAdmin.IEnumCERTVIEWROW;
import de.trustable.ca3s.adcsCertCli.CCertConfig;
import de.trustable.ca3s.adcsCertCli.CCertRequest;
import com.sun.jna.platform.win32.Variant.VARIANT;

public class ADCSNativeImpl implements ADCSWinNativeConnector {

    public static final String CA_DETAILS_TYPE_INTERMEDIATE = "Intermediate";
    public static final String CA_DETAILS_TYPE_ROOT = "Root";

    static final int CVRC_COLUMN_SCHEMA = 0;
    static final int CVR_SEEK_EQ = 1;
    static final int CVR_SEEK_GE = 8;
    static final int CVR_SEEK_GT = 0x10;
    static final int CVR_SORT_NONE = 0;
    static final int CVR_SORT_ASCEND = 1;
    static final int CV_COLUMN_LOG_DEFAULT = -2;

    static final int CC_LOCALACTIVECONFIG = 4;


    static final int CR_PROP_FILEVERSION = 0x00000001;
    static final int CR_PROP_PRODUCTVERSION = 0x00000002;
    static final int CR_PROP_CANAME = 0x00000006;
    static final int CR_PROP_PARENTCA = 0x00000009;
    static final int CR_PROP_CATYPE = 0x0000000A;
    static final int CR_PROP_CASIGCERTCOUNT = 0x0000000B;
    static final int CR_PROP_CASIGCERT = 0x0000000C;
    static final int CR_PROP_CASIGCERTCHAIN = 0x0000000D;
    static final int CR_PROP_DNSNAME = 0x00000016;
    static final int CR_PROP_TEMPLATES = 0x0000001D;
    static final int CR_PROP_SUBJECTTEMPLATE_OIDS = 0x0000002D;


    static final int PROPTYPE_LONG = 0x00000001;
    static final int PROPTYPE_BINARY = 0x00000003;
    static final int PROPTYPE_STRING = 0x00000004;

    static final int CA_TYPE_ROOT = 0x00000003;
    static final int CA_TYPE_INTERMEDIATE = 0x00000004;

    static final int RETRY_MAX_WAITS = 10;
    static final int RETRY_WAIT_MS = 3000;

    private static final Logger LOG = LoggerFactory.getLogger(ADCSNativeImpl.class);

    Factory factReadOnly;
    Factory factModify;

    CCertView cCertViewPEM;
    IEnumCERTVIEWROW certRowPEM;

    String config = "uninitialized";

    static {
        // Initialize COM Subsystem
        Ole32.INSTANCE.CoInitializeEx(com.sun.jna.Pointer.NULL, Ole32.COINIT_MULTITHREADED);

        LOG.info("Ole32.INSTANCE.CoInitializeEx called");
    }

    public ADCSNativeImpl() throws ADCSException {

        // Initialize Factories for COM object creation, one intended for reading and one for creation and revocation
        // Every factory uses a dedicated thread for processing
        factReadOnly = new Factory();
        factModify = new Factory();

        config = getConfig(factReadOnly);

    }

    /**
     * @param fact
     * @return
     * @throws NoLocalADCSException there is no ADCS instnace available
     * @throws ADCSException        inormation about problems
     */
    private String getConfig(Factory fact) throws NoLocalADCSException, ADCSException {
        CCertConfig cCertConf = fact.createObject(CCertConfig.class);

        String config = "";
        try {
            config = cCertConf.GetConfig(CC_LOCALACTIVECONFIG);
        } catch (Throwable th) {

            COMException comEx = getCOMException(th);
            if (comEx == null) {
                LOG.warn("non-comEx : ", th);
            } else {
                // 5.x.x version
//        		LOG.debug("comEx. getHresult() : ", comEx.getHresult().toString());
                String msg = comEx.getExcepInfo().toString();
                if (comEx.getExcepInfo().scode.intValue() == CR_FILE_NOT_FOUND ||
                        comEx.getExcepInfo().scode.intValue() == ERROR_NO_MORE_ITEMS) {

//               	if( "CertificateAuthority.Config".equals(comEx.getExcepInfo().bstrSource.getValue())) {
                    LOG.info("ADCS not available");
                    throw new NoLocalADCSException(msg);
                }

                LOG.debug("comEx : " + msg);
                throw new ADCSException(th.getMessage());
            }
        }

        LOG.debug("iCertConf : " + config);
        return config;
    }

    /* (non-Javadoc)
     * @see de.trustable.ca3s.adcsCertUtil.ADCSWinNativeConnector#getInfo()
     */
    @Override
    public String getInfo() throws ADCSException {

        LOG.debug("getInfo");

        return getConfig(factReadOnly);
    }



    /* (non-Javadoc)
     * @see de.trustable.ca3s.adcsCertUtil.ADCSWinNativeConnector#submitRequest(java.lang.String)
     */
    @Override
    public CertificateEnrollmentResponse submitRequest(final String b64Csr, Map<String, String> attributeMap) throws ADCSException {
		for( int retry = 0; retry < RETRY_MAX_WAITS; retry++){
			try{
				return submitRequestTryable(b64Csr, attributeMap);
			}catch(ADCSRetryException retryException){
				try {
					Thread.sleep(RETRY_WAIT_MS);
				} catch (InterruptedException e) {
					LOG.error("InterruptedException while waiting for ADCS", e);
				}
				LOG.debug("starting retry #" + retry + " for submitRequest");
			}
		}
		throw new ADCSException("waiting for ADCS failed");
	}

	public CertificateEnrollmentResponse submitRequestTryable(final String b64Csr, Map<String, String> attributeMap) throws ADCSRetryException, ADCSException {

			LOG.debug("submitRequest starting ");

        try {

            CCertRequest cCertReq = factModify.createObject(CCertRequest.class);

            Integer requestFormatFlags = 0;

            // build attribute string:
            // "AttributeName1:AttributeValue1\nAttributeName2:AttributeValue2"
            StringBuffer strbufAttributes = new StringBuffer();
            for (String key : attributeMap.keySet()) {
                String value = attributeMap.get(key);
                if (strbufAttributes.length() > 0) {
                    strbufAttributes.append("\n");
                }
                strbufAttributes.append(key).append(":").append(value);
            }
            LOG.debug("request attribute list : '" + strbufAttributes.toString() + "'");

            Integer status = cCertReq.Submit(requestFormatFlags, b64Csr, strbufAttributes.toString(), config);

            int reqId = cCertReq.GetRequestId();
            LOG.debug("Request Id : " + reqId + " has status : " + status);

            CertificateEnrollmentResponse certResp = null;


            switch (status) {
                case CR_DISP_INCOMPLETE:
                    LOG.error("Request incomplete");
                    certResp = new CertificateEnrollmentResponse(SubmitStatus.INCOMPLETE, reqId);
                    break;
                case CR_DISP_ERROR:
                    LOG.error("Submitting request failed ");
                    certResp = new CertificateEnrollmentResponse(SubmitStatus.ERROR, reqId);
                    break;
                case CR_DISP_DENIED:
                    LOG.warn("Request denied");
                    certResp = new CertificateEnrollmentResponse(SubmitStatus.DENIED, reqId);
                    break;
                case CR_DISP_ISSUED:
                    LOG.debug("Request issued");
                    String b64Cert = retrieveEnrolledCertificate(cCertReq, config, reqId);
                    String b64CaCert = cCertReq.GetCACertificate(0, config, 0);
                    LOG.debug("cCertReq GetCACertificate : " + b64CaCert);

                    certResp = new CertificateEnrollmentResponse(SubmitStatus.ISSUED, reqId, b64Cert, b64CaCert);
                    break;
                case CR_DISP_ISSUED_OUT_OF_BAND:
                    LOG.warn("Request issued 'out of band'");
                    break;
                case CR_DISP_UNDER_SUBMISSION:
                    LOG.debug("Request under submission");
                    String b64Cert2 = resubmitRequest(factModify, config, cCertReq);
                    LOG.debug("Certificate issued : \n" + b64Cert2);
                    String b64CaCert2 = cCertReq.GetCACertificate(0, config, 0);
                    LOG.debug("cCertReq GetCACertificate : " + b64CaCert2);
                    certResp = new CertificateEnrollmentResponse(SubmitStatus.ISSUED, reqId, b64Cert2, b64CaCert2);
                    break;
                case CR_DISP_REVOKED:
                    LOG.warn("Request revoked");
                    certResp = new CertificateEnrollmentResponse(SubmitStatus.REVOKED, reqId);
                    break;
                default:
                    LOG.error("Unexected request status " + status);
                    certResp = new CertificateEnrollmentResponse(SubmitStatus.ERROR, reqId);
                    break;
            }

            return certResp;

        } catch (RuntimeException rt) {
            handleCOMException(rt);
            throw rt;
        } catch (Exception e) {
            LOG.info("pool handling eyxception : ", e);
            throw new ADCSException(e.getLocalizedMessage());
        } finally {
            System.gc();
        }
    }


    /**
     * Second phase of certificate issuance
     *
     * @param fact     Win32 object factory
     * @param config   name of the instance to be addressed
     * @param cCertReq COM request object
     * @return base64 encoded certificate
     * @throws ADCSException inormation about problems
     */
    private String resubmitRequest(final Factory fact, final String config, final CCertRequest cCertReq) throws ADCSException {

        int reqId = cCertReq.GetRequestId();

        LOG.debug("resubmitRequest for reqId : " + reqId);

        CCertAdmin cCertAdmin = fact.createObject(CCertAdmin.class);


        LOG.debug("cCertAdmin for resubmitRequest : " + cCertAdmin);

        Integer status = cCertAdmin.ResubmitRequest(config, reqId);
        LOG.debug("status : " + status);

        String statusAsHex = Integer.toHexString(status);
        LOG.debug("Resubmit status : 0x" + statusAsHex);

        if (status == CR_DISP_ISSUED) {
            String certB64 = retrieveEnrolledCertificate(cCertReq, config, reqId);
            return certB64;

        } else if (status == CR_CRL_UNAVAILABLE) {
            LOG.error("Revocation Server Offline Error : 0x" + statusAsHex);
            throw new ADCSException("resubmitting request failed : Revocation Server Offline Error : 0x" + statusAsHex);
        } else {
            LOG.error("Unexected resubmit request status 0x" + statusAsHex);
            throw new ADCSException("resubmitting request failed with response 0x" + statusAsHex);
        }
    }

    /**
     * retrieve the issued certificate, return just the end entity
     *
     * @param cCertReq COM request object
     * @param config   name of the instance to be addressed
     * @param reqId    the request id of the request to process
     * @return base64 encoded end entity certificate
     */
    private String retrieveEnrolledCertificate(final CCertRequest cCertReq, final String config, int reqId) {
        cCertReq.RetrievePending(reqId, config);
        return cCertReq.GetCertificate(0);
    }

    /* (non-Javadoc)
     * @see de.trustable.ca3s.adcsCertUtil.ADCSWinNativeConnector#revokeCertifcate(java.lang.String, int, java.util.Date)
     */
    @Override
    public void revokeCertifcate(final String serial, int reason, final Date revocationDate) throws ADCSException {
		for( int retry = 0; retry < RETRY_MAX_WAITS; retry++){
			try{
				revokeCertifcateTryable(serial, reason, revocationDate);
			}catch(ADCSRetryException retryException){
                if( retry+1 == RETRY_MAX_WAITS ){
                    LOG.debug("retry count expired, throwing exception (" + retryException.getLocalizedMessage() + ")");
                    throw new ADCSException(retryException.getLocalizedMessage());
                }
				try {
					Thread.sleep(RETRY_WAIT_MS);
				} catch (InterruptedException e) {
					LOG.error("InterruptedException while waiting for ADCS", e);
				}
				LOG.debug("starting retry #" + retry + " for revokeCertifcate");
            }catch(Throwable th){
                LOG.debug("not a ADCSRetryException, rethrowing " + th);
                throw th;
			}
		}
		throw new ADCSException("waiting for ADCS failed");
	}

	public void revokeCertifcateTryable(final String serial, int reason, final Date revocationDate) throws ADCSException, ADCSRetryException {

		LOG.debug("revokeCertifcate starting ");

        CCertAdmin cCertAdmin = factModify.createObject(CCertAdmin.class);

        try {

            LOG.debug("revokeCertificate param {}, '{}', {} ", config, serial, reason);
            cCertAdmin.RevokeCertificate(config, serial, reason, revocationDate);

        } catch (RuntimeException rt) {
            handleCOMException(rt);
            throw rt;
        } catch (Exception e) {
            LOG.info("pool handling exception : ", e);
            throw new ADCSException(e.getLocalizedMessage());
        } finally {
            System.gc();
        }
    }


    /**
     * retrieve a list of available request ids in the given range defined by offset and range
     *
     * @param offset the starting number for request retrieval
     * @param limit  the maximum number of request per retrieval call
     * @return list of request ids present in the given range
     * @throws ADCSException inormation about problems
     */
    public List<String> getRequesIdList(int offset, int limit) throws ADCSException {
        return getRequesIdList(limit, offset, 0L, 0L);
    }


    /**
     * retrieve a list of available request ids resolved after resolvedWhenMinTimestamp
     *
     * @param resolvedWhenMinTimestamp the minimal timestamp for 'resolvedWhen'
     * @param limit                    the maximum number of request per retrieval call
     * @return list of request ids present in the given range
     * @throws ADCSException inormation about problems
     */
    public List<String> getRequesIdResolvedList(long resolvedWhenMinTimestamp, int limit) throws ADCSException {
        return getRequesIdList(limit, 0, resolvedWhenMinTimestamp, 0L);
    }


    /**
     * retrieve a list of available request ids revoked after revokedWhenMinTimestamp
     *
     * @param revokedWhenMinTimestamp the minimal timestamp for 'revokedWhen'
     * @param limit                   the maximum number of request per retrieval call
     * @return list of request ids present in the given range
     * @throws ADCSException inormation about problems
     */
    public List<String> getRequesIdRevokedList(long revokedWhenMinTimestamp, int limit) throws ADCSException {
        return getRequesIdList(limit, 0, 0L, revokedWhenMinTimestamp);
    }


    /**
     * retrieve a list of available request ids in the given range limited by either offset, resolvedWhenMinTimestamp or revokedWhenMinTimestamp
     *
     * @param limit                    the maximum number of request per retrieval call
     * @param offset                   the starting number for request retrieval
     * @param resolvedWhenMinTimestamp the minimal timestamp for 'resolvedWhen'
     * @param revokedWhenMinTimestamp  the minimal timestamp for 'revokedWhen'
     * @return list of request ids present in the given range
     * @throws ADCSException inormation about problems
     */
    public List<String> getRequesIdList(int limit, int offset, long resolvedWhenMinTimestamp, long revokedWhenMinTimestamp) throws ADCSException {
		for( int retry = 0; retry < RETRY_MAX_WAITS; retry++){
			try{
				return getRequesIdListTryable( limit, offset, resolvedWhenMinTimestamp, revokedWhenMinTimestamp);
			}catch(ADCSRetryException retryException){
				try {
					Thread.sleep(RETRY_WAIT_MS);
				} catch (InterruptedException e) {
					LOG.error("InterruptedException while waiting for ADCS", e);
				}
				LOG.debug("starting retry #" + retry + " for getRequesIdList");
			}
		}
		throw new ADCSException("waiting for ADCS failed");
	}

	public List<String> getRequesIdListTryable(int limit, int offset, long resolvedWhenMinTimestamp, long revokedWhenMinTimestamp) throws ADCSException, ADCSRetryException {

		LOG.debug("getRequestList starting for #{} items limited by offset {}, resolvedWhenMinTimestamp {}, revokedWhenMinTimestamp {}", limit, offset, resolvedWhenMinTimestamp, revokedWhenMinTimestamp);

        List<String> retList = new ArrayList<>();

        try {

            CCertView cCertView = createMultipleCertView(false);
/*
//	        Integer nColumn = 1;

 			// enable all columns (for testing / debugging purposes)
	        Integer nColumn = cCertView.GetColumnCount(CVRC_COLUMN_SCHEMA);
	        
	        cCertView.SetResultColumnCount(nColumn);
	        for( int col = 0; col < nColumn; col++) {
	        	cCertView.SetResultColumn(col);
	        }
*/
            if (resolvedWhenMinTimestamp > 0L) {
                Date resolvedDate = new Date(resolvedWhenMinTimestamp);
                VARIANT v = new VARIANT(resolvedDate);
                cCertView.SetRestriction(cCertView.GetColumnIndex(0, "Request.ResolvedWhen"), CVR_SEEK_GT, CVR_SORT_ASCEND, v);
                LOG.debug("getRequestList limited by resolvedWhenTimestamp > {} ", resolvedDate);
            } else if (revokedWhenMinTimestamp > 0L) {
                VARIANT v = new VARIANT(new Date(revokedWhenMinTimestamp));
                cCertView.SetRestriction(cCertView.GetColumnIndex(0, "Request.RevokedEffectiveWhen"), CVR_SEEK_GT, CVR_SORT_ASCEND, v);
                LOG.debug("getRequestList limited by revokedEffectiveWhen > {} ", new Date(revokedWhenMinTimestamp));
            } else {
                cCertView.SetRestriction(cCertView.GetColumnIndex(0, "RequestID"), CVR_SEEK_GT, CVR_SORT_ASCEND, offset);
                LOG.debug("getRequestList limited by requestId > {} ", offset);
            }

            IEnumCERTVIEWROW certRow = cCertView.OpenView();


            certRow.Reset();
            while (certRow.Next() != -1) {

                IEnumCERTVIEWCOLUMN cols = certRow.EnumCertViewColumn();
                cols.Reset();
                String requestId = "";
                int col = 0;
                while (cols.Next() != -1) {
                    LOG.debug("#" + col + ": " + cols.GetName() + " " + cols.GetType() + " " + cols.GetValue(0));

                    if (col == 0) {
                        requestId = cols.GetValue(0).toString();
                        retList.add(requestId);
                    }
/*					
					if(col == 3){
						// check base64 certificate column, return this id only if there is a certificate present 
						if( (cols.GetValue(0) != null ) && (cols.GetValue(0).toString().trim().length() > 0) ){
							retList.add(requestId);
						}
					}
*/
                    col++;
                }

                if (retList.size() >= limit) {
                    LOG.debug("limit (" + limit + ") of result rows reached");
                    break;
                } else {
                    LOG.debug("current result set has size #{}", retList.size());
                }

            }

        } catch (RuntimeException rt) {
            LOG.info("Runtime exception :", rt);
            handleCOMException(rt);
            throw rt;
        } catch (Exception e) {
            LOG.info("pool handling eyxception : ", e);
            throw new ADCSException(e.getLocalizedMessage());
        } finally {
            System.gc();
        }

        return retList;
    }

    CCertView createMultipleCertView(boolean includePEM) throws ADCSException {

        LOG.debug("createMultipleCertView ");

        CCertView cCertView = createCertView();

        Integer nColumn = 3;
        if (includePEM) {
            nColumn++;
        }
        cCertView.SetResultColumnCount(nColumn);

        int requestIDColumnIndex = cCertView.GetColumnIndex(0, "RequestID");
        int resolvedDateColumnIndex = cCertView.GetColumnIndex(0, "Request.ResolvedWhen");
        int revokedDateColumnIndex = cCertView.GetColumnIndex(0, "Request.RevokedEffectiveWhen");


        cCertView.SetResultColumn(requestIDColumnIndex);
        cCertView.SetResultColumn(resolvedDateColumnIndex);
        cCertView.SetResultColumn(revokedDateColumnIndex);

        if (includePEM) {
            int certColumnIndex = cCertView.GetColumnIndex(0, "RawCertificate");
            cCertView.SetResultColumn(certColumnIndex);
        }

        return cCertView;
    }


    /* (non-Javadoc)
     * @see de.trustable.ca3s.adcsCertUtil.ADCSWinNativeConnector#getCertificateByRequestId(java.lang.String)
     */
    public GetCertificateResponse getCertificateByRequestId(final String reqId) throws ADCSException {
		for( int retry = 0; retry < RETRY_MAX_WAITS; retry++){
			try{
				return getCertificateByRequestIdTryable(reqId);
			}catch(ADCSRetryException retryException){
				try {
					Thread.sleep(RETRY_WAIT_MS);
				} catch (InterruptedException e) {
					LOG.error("InterruptedException while waiting for ADCS", e);
				}
				LOG.debug("starting retry #" + retry + " for getCertificateByRequestId");
			}
		}
		throw new ADCSException("waiting for ADCS failed");
	}

	public GetCertificateResponse getCertificateByRequestIdTryable(final String reqId) throws ADCSException, ADCSRetryException {
        LOG.debug("getCertificateByRequestId({})", reqId);

        try {

            SingleCertView scv = createSingleCertView();

            scv.getcCertView().SetRestriction(scv.getcCertView().GetColumnIndex(0, "RequestID"), CVR_SEEK_EQ, CVR_SORT_NONE, Integer.parseInt(reqId));

            return getRow(scv.getCertRowPEM());

        } catch (RuntimeException rt) {
            handleCOMException(rt);
            throw rt;

        } catch (Exception e) {
            LOG.info("general exception : ", e);
            throw new ADCSException(e.getLocalizedMessage());

        } finally {
            System.gc();
        }

    }

    private GetCertificateResponse getRow(IEnumCERTVIEWROW certRow) {

        if (certRow != null) {
            certRow.Reset();
            int ret = 0;
            int row = 0;

            if (hasMore(certRow)) {
                LOG.debug("ret : " + ret + ", row : " + row++);

                IEnumCERTVIEWCOLUMN cols = certRow.EnumCertViewColumn();

                cols.Next();
                LOG.info("" + cols.GetName() + " " + cols.GetType() + " " + cols.GetValue(0));

                String requestID = cols.GetValue(0).toString();
                String b64Cert = "";
                String template = "";
                String resolvedDate = "";
                String revokedDate = "";
                String revokedReason = "";
                String disposition = "";
                String dispositionMessage = "";

                cols.Next();
//				LOG.debug("" + cols.GetName() + " " + cols.GetType() + " " + cols.GetValue(0));
                if (cols.GetValue(0) != null) {
                    b64Cert = cols.GetValue(0).toString();
                }

                cols.Next();
//				LOG.debug("" + cols.GetName() + " " + cols.GetType() + " " + cols.GetValue(0));
                if (cols.GetValue(0) != null) {
                    template = cols.GetValue(0).toString();
                }

                cols.Next();
//				LOG.debug("" + cols.GetName() + " " + cols.GetType() + " " + cols.GetValue(0));
                if (cols.GetValue(0) != null) {
                    resolvedDate = Long.toString(((Date) cols.GetValue(0)).getTime());
                }

                cols.Next();
//				LOG.debug("" + cols.GetName() + " " + cols.GetType() + " " + cols.GetValue(0));
                if (cols.GetValue(0) != null) {
                    revokedDate = Long.toString(((Date) cols.GetValue(0)).getTime());
                }

                cols.Next();
//				LOG.debug("" + cols.GetName() + " " + cols.GetType() + " " + cols.GetValue(0));
                if (cols.GetValue(0) != null) {
                    revokedReason = cols.GetValue(0).toString();
                }

                cols.Next();
//				LOG.debug("" + cols.GetName() + " " + cols.GetType() + " " + cols.GetValue(0));
                if (cols.GetValue(0) != null) {
                    disposition = cols.GetValue(0).toString();
                }

                cols.Next();
//				LOG.debug("" + cols.GetName() + " " + cols.GetType() + " " + cols.GetValue(0));
                if (cols.GetValue(0) != null) {
                    dispositionMessage = cols.GetValue(0).toString();
                }

                return new GetCertificateResponse(requestID, b64Cert, template, resolvedDate, revokedDate, revokedReason, disposition, dispositionMessage);
            }
        }
        return null;
    }


    private boolean hasMore(IEnumCERTVIEWROW certRow) {

        Integer intNext = certRow.Next();
        if ((intNext != null) && (intNext != -1)) {
            return true;
        }
        return false;
    }

    /**
     * build a simple view of three columns holding the id, certificate and template
     *
     * @return the CCertView object configured to hold the columns
     * @throws ADCSException something in the communication with ADCS went wrong
     */
    public SingleCertView createSingleCertView() throws ADCSException {

        LOG.debug("create new SingleCertView");

        CCertView cCertView = createCertView();

        Integer nColumn = 8;
        cCertView.SetResultColumnCount(nColumn);

        cCertView.SetResultColumn(cCertView.GetColumnIndex(0, "RequestID"));
        cCertView.SetResultColumn(cCertView.GetColumnIndex(0, "RawCertificate"));
        cCertView.SetResultColumn(cCertView.GetColumnIndex(0, "CertificateTemplate"));
        cCertView.SetResultColumn(cCertView.GetColumnIndex(0, "Request.ResolvedWhen"));
        cCertView.SetResultColumn(cCertView.GetColumnIndex(0, "Request.RevokedEffectiveWhen"));
        cCertView.SetResultColumn(cCertView.GetColumnIndex(0, "Request.RevokedReason"));
        cCertView.SetResultColumn(cCertView.GetColumnIndex(0, "Request.Disposition"));
        cCertView.SetResultColumn(cCertView.GetColumnIndex(0, "Request.DispositionMessage"));

        IEnumCERTVIEWROW certRowPEM = cCertView.OpenView();

        return new SingleCertView(cCertView, certRowPEM);
    }

    public CCertView createCertView() throws ADCSException {

        LOG.debug("create new CCertView ");

        CCertView cCertView = factReadOnly.createObject(CCertView.class);

        cCertView.OpenConnection(config);
        return cCertView;
    }


    /* (non-Javadoc)
     * @see de.trustable.ca3s.adcsCertUtil.ADCSWinNativeConnector#getCATemplates()
     */
    @Override
    public String[] getCATemplates() throws ADCSException {
        CCertRequest certReq = factReadOnly.createObject(CCertRequest.class);

        try {
            String templateString = certReq.GetCAProperty(getInfo(), CR_PROP_TEMPLATES, 0, PROPTYPE_STRING, 0).toString();
            if (templateString == null) {
                return new String[0];
            }
            String[] pairArr = templateString.split("\n");
            String[] nameArr = new String[pairArr.length / 2];
            for (int i = 0, j = 0; i < pairArr.length; i += 2, j++) {
                nameArr[j] = pairArr[i];
            }
            return nameArr;
        } catch (Exception e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    /* (non-Javadoc)
     * @see de.trustable.ca3s.adcsCertUtil.ADCSWinNativeConnector#getCAInstanceDetails()
     */
    @Override
    public ADCSInstanceDetails getCAInstanceDetails() throws ADCSException {

        ADCSInstanceDetails aiDetails = new ADCSInstanceDetails();

        CCertRequest certReq = factReadOnly.createObject(CCertRequest.class);

        try {
            String info = getInfo();

            String caName = certReq.GetCAProperty(info, CR_PROP_CANAME, 0, PROPTYPE_STRING, 0).toString();
            aiDetails.setCaName(caName);

            Integer type = (Integer) certReq.GetCAProperty(info, CR_PROP_CATYPE, 0, PROPTYPE_LONG, 0);
            if (CA_TYPE_ROOT == type) {
                aiDetails.setCaType(CA_DETAILS_TYPE_ROOT);
            } else if (CA_TYPE_INTERMEDIATE == type) {
                aiDetails.setCaType(CA_DETAILS_TYPE_INTERMEDIATE);
            } else {
                aiDetails.setCaType("Unknown type " + type);
            }


            try {
                String fileVersion = certReq.GetCAProperty(info, CR_PROP_FILEVERSION, 0, PROPTYPE_STRING, 0).toString();
                aiDetails.setFileVersion(fileVersion);
            } catch (Exception ex) {
                LOG.debug("problem calling for fileVersion: " + ex.getMessage());
            }

            try {
                String productVersion = certReq.GetCAProperty(info, CR_PROP_PRODUCTVERSION, 0, PROPTYPE_STRING, 0).toString();
                aiDetails.setProductVersion(productVersion);
            } catch (Exception ex) {
                LOG.debug("problem calling for productVersion: " + ex.getMessage());
            }

            try {
                String parentCA = certReq.GetCAProperty(info, CR_PROP_PARENTCA, 0, PROPTYPE_STRING, 0).toString();
                aiDetails.setParentCaName(parentCA);
            } catch (Exception ex) {
                LOG.debug("problem calling for parentCA: " + ex.getMessage());
            }

            try {
                String dnsName = certReq.GetCAProperty(info, CR_PROP_DNSNAME, 0, PROPTYPE_STRING, 0).toString();
                aiDetails.setDnsName(dnsName);
            } catch (Exception ex) {
                LOG.debug("problem calling for dnsName: " + ex.getMessage());
            }

            try {
                Integer count = (Integer) certReq.GetCAProperty(info, CR_PROP_CASIGCERTCOUNT, 0, PROPTYPE_LONG, 0);

                String[] sigCertArr = new String[count];

                for (int i = 0; i < count; i++) {
                    sigCertArr[i] = certReq.GetCAProperty(info, CR_PROP_CASIGCERT, i, PROPTYPE_BINARY, 0).toString().replaceAll("\\r\\n", "\\n");
                }
                aiDetails.setSigningCerts(sigCertArr);
                ;

                String[] sigChainArr = new String[count];

                for (int i = 0; i < count; i++) {
                    sigChainArr[i] = certReq.GetCAProperty(info, CR_PROP_CASIGCERTCHAIN, i, PROPTYPE_BINARY, 0).toString().replaceAll("\\r\\n", "\\n");
                }
                aiDetails.setSigningCertChains(sigChainArr);

            } catch (Exception ex) {
                LOG.debug("problem calling for signing certificates / chains: " + ex.getMessage());
            }

            try {
                String templateString = certReq.GetCAProperty(info, CR_PROP_TEMPLATES, 0, PROPTYPE_STRING, 0).toString();
                if (templateString != null) {
                    String[] pairArr = templateString.split("\n");
                    String[] nameArr = new String[pairArr.length / 2];
                    String[] oidArr = new String[pairArr.length / 2];
                    for (int i = 0, j = 0; i < pairArr.length; i += 2, j++) {
                        nameArr[j] = pairArr[i];
                        oidArr[j] = pairArr[i + 1];
                    }

                    aiDetails.setTemplates(nameArr);
                    aiDetails.setTemplateOIDs(oidArr);
                }
            } catch (Exception ex) {
                LOG.debug("problem calling for templates: " + ex.getMessage());
            }


            try {
                String templateString = certReq.GetCAProperty(info, CR_PROP_SUBJECTTEMPLATE_OIDS, 0, PROPTYPE_STRING, 0).toString();
                if (templateString != null) {
                    aiDetails.setSubjectTemplateOIDs(templateString.split("\n"));
                }
            } catch (Exception ex) {
                LOG.debug("problem calling for subjectTemplateOIDs: " + ex.getMessage());
            }


        } catch (Exception e) {
            LOG.warn("problem retrieving data for getCAInstanceDetails", e);
            throw new ADCSException(e.getMessage());
        }

        return aiDetails;
    }

    private void handleCOMException(RuntimeException rt) throws ADCSRetryException, ADCSException {
        COMException comEx = getCOMException(rt);
        if (comEx != null) {

            // 5.x.x version
//        		LOG.debug("comEx.getHresult() : ", comEx.getHresult().toString());
//        		throw new ADCSException(comEx.getHresult().toString());

            int scode = comEx.getExcepInfo().scode.intValue();
			if (-2146892976 == scode) {   // 0x80090350
				// DC not avialable (yet),
				// try again
				throw new ADCSRetryException("DC not avialable");

			} else if (-2146877425 == scode) {   // 0x8009400f

//        		    By default, the Windows Server 2003 certification authority allows only 20 concurrent sessions to the CA database. To increase the maximum number of sessions to 30 (highest tested limit for Windows Server 2003):
//
//        		    certutil -setreg dbsessioncount 30
//        		    net stop certsvc+ && net start certsvc

                // out of db connection, try to release some ...
                System.gc();

                throw new OODBConnectionsADCSException(comEx.getExcepInfo().toString());
            }

            throw new ADCSException(comEx.getExcepInfo().toString());
        }

        LOG.warn("handleCOMException: Not a COMException, rethrowing ...", rt);

    }

    COMException getCOMException(Throwable ex) {

        for (int i = 0; i < 10; i++) {
//    		LOG.debug("Exception Stack #" + i, ex);

            if (ex instanceof COMException) {
                return (COMException) ex;
            }
            if (ex.getCause() == null) {
                break;
            }
            ex = ex.getCause();
        }
        return null;
    }

}
