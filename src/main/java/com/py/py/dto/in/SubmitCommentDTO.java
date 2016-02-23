package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class SubmitCommentDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6883310516195525339L;
	private long cost;
	private String content;
	private String backer;
	private boolean warning;
	
	public SubmitCommentDTO() {
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getBacker() {
		return backer;
	}

	public void setBacker(String backer) {
		this.backer = backer;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}
	
}
