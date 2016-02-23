package com.py.py.dto.in.admin;

import com.py.py.dto.DTO;

public class ChangeBalanceDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8338395905492146299L;
	private long amount;
	
	public ChangeBalanceDTO() {
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
}
