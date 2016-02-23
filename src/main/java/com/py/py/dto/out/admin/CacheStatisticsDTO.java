package com.py.py.dto.out.admin;

import java.util.Map;

import com.py.py.dto.DTO;

public class CacheStatisticsDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3605825847517841091L;
	private Map<String, Map<String, Object> > caches;
	
	public CacheStatisticsDTO() {
	}

	public Map<String, Map<String, Object> > getCaches() {
		return caches;
	}

	public void setCaches(Map<String, Map<String, Object> > caches) {
		this.caches = caches;
	}
}
