package com.py.py.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class URIBuilder {
	
	protected static final String encoding = "UTF-8";
	
	public static String buildPathVariable(String pathVariable) {
		try {
			if(pathVariable == null || pathVariable.isEmpty()) {
				return pathVariable;
			}
			return URLEncoder.encode(pathVariable, encoding);
		} catch(UnsupportedEncodingException uee) {
			return pathVariable;
		}
	}
	
	public static String removeParameters(Map<String, String[]> paramMap, 
			List<String> params) {
		if(params == null) {
			return buildParamsFromMapList(paramMap);
		}
		Map<String, String[]> map = new HashMap<String, String[]>();
		
		if(paramMap != null) {
			for(Map.Entry<String, String[]> entry : paramMap.entrySet()) {
				if(!params.contains(entry.getKey())) {
					map.put(entry.getKey(), entry.getValue());
				}
			}
		}
		
		return buildParamsFromMapList(map);
	}
	
	public static String appendParameter(Map<String, String[]> paramMap, 
			String param, String value) {
		if(param == null) {
			return buildParamsFromMapList(paramMap);
		}
		Map<String, String[]> map = new HashMap<String, String[]>();
		
		if(paramMap != null) {
			map.putAll(paramMap);
		}
		
		map.put(param, new String[]{value});
		return buildParamsFromMapList(map);
	}
	
	public static String buildParamsFromMap(Map<String, String> m) {
		String paramString = "";
		if(m == null || m.isEmpty()) {
			return "";
		}
		
		for(String k : m.keySet()) {
			String v = m.get(k);
			if(v != null) {
				paramString = paramString + constructParameter(k, v);
			} else {
				paramString = paramString + constructParameter(k, null);
			}
		}
		paramString = paramString.replaceFirst("^&", "?");
		return paramString;
	}
	
	public static String buildParamsFromMapList(Map<String, String[]> m) {
		String paramString = "";
		if(m == null || m.isEmpty()) {
			return "";
		}
		
		for(String k : m.keySet()) {
			String[] v = m.get(k);
			if(v != null && v.length > 0) {
				for(String vn : v) {
					paramString = paramString + constructParameter(k, vn);
				}
			} else {
				paramString = paramString + constructParameter(k, null);
			}
		}
		paramString = paramString.replaceFirst("^&", "?");
		return paramString;
	}
	
	protected static String constructParameter(String name, String value) {
		if(name == null || name.isEmpty()) {
			return "";
		}
		try {
			if(value != null) {
				return "&" + name + "=" + URLEncoder.encode(value, encoding);
			}
		} catch(UnsupportedEncodingException uee) {
			// continue
		}
		return "&" + name;
	}

}
