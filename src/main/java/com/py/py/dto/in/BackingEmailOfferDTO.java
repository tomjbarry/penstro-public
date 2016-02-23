package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class BackingEmailOfferDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8558489881475106511L;
	private String email;
	private long amount;
	
	public BackingEmailOfferDTO() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
}
