package de.trustable.ca3s.adcsCertUtil;

import de.trustable.ca3s.adcsCertAdmin.CCertView;
import de.trustable.ca3s.adcsCertAdmin.IEnumCERTVIEWROW;

public class SingleCertView {

	private CCertView cCertView;
	private IEnumCERTVIEWROW certRowPEM;
	
	public SingleCertView(CCertView cCertView, IEnumCERTVIEWROW certRowPEM) {
		this.cCertView = cCertView;
		this.certRowPEM = certRowPEM;
	}
	
	public CCertView getcCertView() {
		return cCertView;
	}
	
	public IEnumCERTVIEWROW getCertRowPEM() {
		return certRowPEM;
	}

}
