package com.py.py.dto.in;

import java.util.List;

import com.py.py.dto.DTO;

public class PromotePostingDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8069231710267911013L;
	private long promotion;
	private List<String> tags;
	private boolean warning;
	
	public PromotePostingDTO() {
	}

	public long getPromotion() {
		return promotion;
	}

	public void setPromotion(long promotion) {
		this.promotion = promotion;
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
}
