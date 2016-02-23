package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class ChangeEmailRequestDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8031045600532209277L;
	private String password;
	
	public ChangeEmailRequestDTO() {
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
