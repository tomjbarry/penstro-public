package com.py.py.dto.in;

import com.py.py.dto.DTO;

public class ChangePaymentDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6908196383326366356L;
	private String paymentId;
	private String password;
	
	public ChangePaymentDTO() {
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
