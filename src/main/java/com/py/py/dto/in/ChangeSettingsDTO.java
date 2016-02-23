package com.py.py.dto.in;

import java.util.List;
import java.util.Map;

import com.py.py.dto.DTO;
import com.py.py.enumeration.EVENT_TYPE;
import com.py.py.enumeration.SETTING_OPTION;
import com.py.py.generic.Filter;

public class ChangeSettingsDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4373609638992462853L;
	List<EVENT_TYPE> hiddenNotificationEvents;
	List<EVENT_TYPE> hiddenFeedEvents;
	List<Filter> filters;
	Map<SETTING_OPTION, Boolean> options;
	String language;
	String interfaceLanguage;
	
	public ChangeSettingsDTO() {
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

	public List<Filter> getFilters() {
		return filters;
	}

	public void setFilters(List<Filter> filters) {
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
	
}
