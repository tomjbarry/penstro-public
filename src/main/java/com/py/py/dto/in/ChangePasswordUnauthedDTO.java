package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class ChangePasswordUnauthedDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1424316834400052734L;
	private String newPassword;
	private String confirmNewPassword;
	
	public ChangePasswordUnauthedDTO() {
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
