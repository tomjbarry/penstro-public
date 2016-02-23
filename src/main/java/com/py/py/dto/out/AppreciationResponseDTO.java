package com.py.py.dto.out;

import com.py.py.dto.DTO;

public class AppreciationResponseDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3926601138174727024L;
	private UsernameDTO username;
	private String appreciationResponse;
	private boolean appreciationResponseWarning;
	
	public AppreciationResponseDTO() {
	}

	public UsernameDTO getUsername() {
		return username;
	}

	public void setUsername(UsernameDTO username) {
		this.username = username;
	}

	public String getAppreciationResponse() {
		return appreciationResponse;
	}

	public void setAppreciationResponse(String appreciationResponse) {
		this.appreciationResponse = appreciationResponse;
	}

	public Boolean isAppreciationResponseWarning() {
		return appreciationResponseWarning;
	}

	public void setAppreciationResponseWarning(Boolean appreciationResponseWarning) {
		this.appreciationResponseWarning = appreciationResponseWarning;
	}
}
