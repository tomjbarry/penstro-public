package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class ChangeEmailDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6766384950555369142L;
	private String email;
	private String password;
	
	public ChangeEmailDTO() {
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
