package com.py.py.dto.in.admin;

import com.py.py.dto.DTO;

public class ChangeUsernameDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4967742972176345705L;
	private String username;
	
	public ChangeUsernameDTO() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
