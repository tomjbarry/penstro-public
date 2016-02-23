package com.py.py.generic;

import java.util.List;

import com.py.py.enumeration.SORT_OPTION;
import com.py.py.enumeration.TIME_OPTION;

public class Filter {

	public static final String SORT = "sort";
	public static final String TIME = "time";
	public static final String WARNING = "warning";
	public static final String TAGS = "tags";
	
	public SORT_OPTION sort = SORT_OPTION.VALUE;
	public TIME_OPTION time = TIME_OPTION.HOUR;
	public Boolean warning;
	public List<String> tags = null;
	//public List<String> excludeTags = null;

	public Filter() {
	}

	public SORT_OPTION getSort() {
		return sort;
	}

	public void setSort(SORT_OPTION sort) {
		this.sort = sort;
	}

	public TIME_OPTION getTime() {
		return time;
	}

	public void setTime(TIME_OPTION time) {
		this.time = time;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Boolean getWarning() {
		return warning;
	}

	public void setWarning(Boolean warning) {
		this.warning = warning;
	}
}
