package com.py.py.dto.out;

import com.py.py.dto.DTO;

public class BalanceDTO extends DTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5762384920045032479L;
	private long balance;
	
	public BalanceDTO() {
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
}
