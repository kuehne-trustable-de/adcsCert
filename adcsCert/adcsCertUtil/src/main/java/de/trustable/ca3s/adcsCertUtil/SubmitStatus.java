package de.trustable.ca3s.adcsCertUtil;

public enum SubmitStatus {

	INCOMPLETE(0),
	ERROR(1),
	DENIED(2),
	ISSUED(3),
	ISSUED_OUT_OF_BAND(4),
	UNDER_SUBMISSION(5),
	REVOKED(6);

	private final int responseStatus;
	
	SubmitStatus(int status){
		this.responseStatus = status;
	}
	
	public int getStatus(){
		return this.responseStatus;
	}
}

