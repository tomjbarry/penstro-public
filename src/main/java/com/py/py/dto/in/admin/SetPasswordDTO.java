package com.py.py.dto.in.admin;

import com.py.py.dto.DTO;

public class SetPasswordDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6400044613063397895L;
	protected String password;
	
	public SetPasswordDTO() {
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
