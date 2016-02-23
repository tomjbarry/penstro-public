package com.py.py.dto.out;

import java.util.List;
import java.util.Map;

import com.py.py.dto.DTO;
import com.py.py.enumeration.EVENT_TYPE;
import com.py.py.enumeration.SETTING_OPTION;
import com.py.py.generic.Filter;

public class SettingsDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2931644149946088601L;
	private UsernameDTO username;
	private String email;
	private String paymentId;
	private Map<SETTING_OPTION, Boolean> options;
	private List<EVENT_TYPE> hiddenNotificationEvents;
	private List<EVENT_TYPE> hiddenFeedEvents;
	private Map<Integer, Filter> filters;
	String language;
	String interfaceLanguage;
	
	public SettingsDTO() {
	}
	
	public UsernameDTO getUsername() {
		return username;
	}
	public void setUsername(UsernameDTO username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Map<SETTING_OPTION, Boolean> getOptions() {
		return options;
	}

	public void setOptions(Map<SETTING_OPTION, Boolean> options) {
		this.options = options;
	}

	public List<EVENT_TYPE> getHiddenNotificationEvents() {
		return hiddenNotificationEvents;
	}

	public void setHiddenNotificationEvents(
			List<EVENT_TYPE> hiddenNotificationEvents) {
		this.hiddenNotificationEvents = hiddenNotificationEvents;
	}

	public List<EVENT_TYPE> getHiddenFeedEvents() {
		return hiddenFeedEvents;
	}

	public void setHiddenFeedEvents(List<EVENT_TYPE> hiddenFeedEvents) {
		this.hiddenFeedEvents = hiddenFeedEvents;
	}

	public Map<Integer, Filter> getFilters() {
		return filters;
	}

	public void setFilters(Map<Integer, Filter> filters) {
		this.filters = filters;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}

	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	
	
}
