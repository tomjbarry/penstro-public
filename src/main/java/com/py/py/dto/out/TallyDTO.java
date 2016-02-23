package com.py.py.dto.out;

import com.py.py.dto.DTO;

public class TallyDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3482617407806962945L;
	private long cost;
	private long appreciation;
	private long promotion;
	
	public TallyDTO() {
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}
	
	public void setValue(long value) {
		// used only for mapping
	}
	
	public long getValue() {
		return cost + promotion;
	}

	public long getAppreciation() {
		return appreciation;
	}

	public void setAppreciation(long appreciation) {
		this.appreciation = appreciation;
	}

	public long getPromotion() {
		return promotion;
	}

	public void setPromotion(long promotion) {
		this.promotion = promotion;
	}
	
}
