package de.trustable.ca3s.adcsCertUtil;

import com.sun.jna.platform.win32.COM.COMException;

public class ADCSProxyTLSException extends ADCSException {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4093870618862580592L;

	public ADCSProxyTLSException(String msg, COMException ex) {
		super(msg, ex);
	}

	public ADCSProxyTLSException(String msg) {
		super(msg);
	}

}
