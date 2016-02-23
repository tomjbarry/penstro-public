package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class RegisterUserDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4337209199707267639L;
	private String username;
	private String email;
	private String password;
	private String confirmNewPassword;
	private Boolean ageMinimum;
	private String recaptchaResponse;
	private Boolean rememberMe;
	
	public RegisterUserDTO() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

	public void setConfirmNewPassword(String confirmNewPassword) {
		this.confirmNewPassword = confirmNewPassword;
	}

	public Boolean getAgeMinimum() {
		return ageMinimum;
	}

	public void setAgeMinimum(Boolean ageMinimum) {
		this.ageMinimum = ageMinimum;
	}

	public String getRecaptchaResponse() {
		return recaptchaResponse;
	}

	public void setRecaptchaResponse(String recaptchaResponse) {
		this.recaptchaResponse = recaptchaResponse;
	}

	public Boolean getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(Boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
	
}
