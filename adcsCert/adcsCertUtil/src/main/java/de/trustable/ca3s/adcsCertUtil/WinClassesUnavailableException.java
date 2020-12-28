package de.trustable.ca3s.adcsCertUtil;

import com.sun.jna.platform.win32.COM.COMException;

public class WinClassesUnavailableException extends ADCSException {


	/**
	 * 
	 */
	private static final long serialVersionUID = -5462989929103801772L;

	public WinClassesUnavailableException(String msg, COMException ex) {
		super(msg, ex);
	}

	public WinClassesUnavailableException(String msg) {
		super(msg);
	}

	public WinClassesUnavailableException() {
		super("Windows connection classes not available");
	}


}
