package de.trustable.ca3s.adcsCertUtil;

import com.sun.jna.platform.win32.COM.COMException;

public class OODBConnectionsADCSException extends ADCSException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3531890234582762423L;

	public OODBConnectionsADCSException(String msg, COMException ex) {
		super(msg, ex);
	}

	public OODBConnectionsADCSException(String msg) {
		super(msg);
	}


}
