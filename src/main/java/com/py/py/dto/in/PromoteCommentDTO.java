package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class PromoteCommentDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8246051737831168951L;
	private long promotion;
	private boolean warning;
	
	public PromoteCommentDTO() {
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

	public long getPromotion() {
		return promotion;
	}

	public void setPromotion(long promotion) {
		this.promotion = promotion;
	}
}
