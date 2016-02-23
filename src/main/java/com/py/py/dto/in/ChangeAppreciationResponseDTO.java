package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class ChangeAppreciationResponseDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8608835628416126371L;
	private String appreciationResponse;
	private boolean appreciationResponseWarning;
	
	public ChangeAppreciationResponseDTO() {
	}

	public String getAppreciationResponse() {
		return appreciationResponse;
	}

	public void setAppreciationResponse(String appreciationResponse) {
		this.appreciationResponse = appreciationResponse;
	}

	public boolean isAppreciationResponseWarning() {
		return appreciationResponseWarning;
	}

	public void setAppreciationResponseWarning(boolean appreciationResponseWarning) {
		this.appreciationResponseWarning = appreciationResponseWarning;
	}
	
	
}
