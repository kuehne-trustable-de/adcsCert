package de.trustable.ca3s.adcsCertUtil;

import com.sun.jna.platform.win32.COM.COMException;

public class NoLocalADCSException extends ADCSException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3531690434382862433L;

	public NoLocalADCSException(String msg, COMException ex) {
		super(msg, ex);
	}

	public NoLocalADCSException(String msg) {
		super(msg);
	}


}
