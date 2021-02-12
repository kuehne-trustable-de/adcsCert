package de.trustable.ca3s.adcsCertUtil;

import com.sun.jna.platform.win32.COM.COMException;

public class ADCSException extends Exception {

	public ADCSException(String msg, COMException ex) {
		super(msg, ex);
	}

	public ADCSException(String msg) {
		super(msg);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4814346791406639383L;

}
