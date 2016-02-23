package com.py.py.dto.out;

import java.util.List;

import com.py.py.dto.DTO;

public class CurrentUserDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6195864562737226493L;
	private UsernameDTO username;
	private String email;
	private String paymentId;
	private long notificationCount;
	private long feedCount;
	private long messageCount;
	private long loginFailureCount;
	private List<String> pendingActions;
	
	public CurrentUserDTO() {
	}

	public UsernameDTO getUsername() {
		return username;
	}

	public void setUsername(UsernameDTO username) {
		this.username = username;
	}

	public long getNotificationCount() {
		return notificationCount;
	}

	public void setNotificationCount(long notificationCount) {
		this.notificationCount = notificationCount;
	}

	public long getMessageCount() {
		return messageCount;
	}

	public void setMessageCount(long messageCount) {
		this.messageCount = messageCount;
	}

	public long getFeedCount() {
		return feedCount;
	}

	public void setFeedCount(long feedCount) {
		this.feedCount = feedCount;
	}

	public long getLoginFailureCount() {
		return loginFailureCount;
	}

	public void setLoginFailureCount(long loginFailureCount) {
		this.loginFailureCount = loginFailureCount;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public List<String> getPendingActions() {
		return pendingActions;
	}

	public void setPendingActions(List<String> pendingActions) {
		this.pendingActions = pendingActions;
	}
	
	
	
}
