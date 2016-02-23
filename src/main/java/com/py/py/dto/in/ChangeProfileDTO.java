package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class ChangeProfileDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3576236362774606018L;
	private String description;
	private boolean warning;
	
	public ChangeProfileDTO() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}
}
