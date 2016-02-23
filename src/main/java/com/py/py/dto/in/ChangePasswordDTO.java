package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class ChangePasswordDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3053424926567689699L;
	private String oldPassword;
	private String newPassword;
	private String confirmNewPassword;
	
	public ChangePasswordDTO() {
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

	public void setConfirmNewPassword(String confirmNewPassword) {
		this.confirmNewPassword = confirmNewPassword;
	}
	
	
}
