package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class BackingOfferDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7481064942571663455L;
	private String username;
	private long amount;
	
	public BackingOfferDTO() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
}
