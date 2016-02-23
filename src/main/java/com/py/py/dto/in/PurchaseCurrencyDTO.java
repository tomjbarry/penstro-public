package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class PurchaseCurrencyDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4559001267508901740L;
	private long amount;
	
	public PurchaseCurrencyDTO() {
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
}
