package com.py.py.dto.in;

import java.util.List;

import com.py.py.dto.DTO;

public class AppreciatePostingDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5499177381025834196L;
	private String appreciation;
	private List<String> tags;
	private boolean warning;
	
	public AppreciatePostingDTO() {
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
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
