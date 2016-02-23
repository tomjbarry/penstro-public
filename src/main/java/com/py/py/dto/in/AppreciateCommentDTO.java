package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class AppreciateCommentDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5704496157537763120L;
	private String appreciation;
	private boolean warning;
	
	public AppreciateCommentDTO() {
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

	public String getAppreciation() {
		return appreciation;
	}

	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}
}
