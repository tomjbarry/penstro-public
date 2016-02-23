package com.py.py.dto.in.admin;

import com.py.py.dto.DTO;

public class ChangeEmailAdminDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3714645920319569271L;
	private String email;
	
	public ChangeEmailAdminDTO() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
