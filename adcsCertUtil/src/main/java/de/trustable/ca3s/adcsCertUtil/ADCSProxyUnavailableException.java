package de.trustable.ca3s.adcsCertUtil;

import com.sun.jna.platform.win32.COM.COMException;

public class ADCSProxyUnavailableException extends ADCSException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 6650413458189476165L;

	public ADCSProxyUnavailableException(String msg, COMException ex) {
		super(msg, ex);
	}

	public ADCSProxyUnavailableException(String msg) {
		super(msg);
	}

}
