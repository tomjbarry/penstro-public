package com.py.py.dto.in.admin;

import com.py.py.dto.DTO;

public class ChangeTallyDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1540089432999531807L;
	private long cost;
	private long promotion;
	private String appreciation;
	
	public ChangeTallyDTO() {
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public long getPromotion() {
		return promotion;
	}

	public void setPromotion(long promotion) {
		this.promotion = promotion;
	}

	public String getAppreciation() {
		return appreciation;
	}

	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}
	
	
}
