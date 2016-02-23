package com.py.py.dto.out;

import java.util.List;

import com.py.py.dto.DTO;

public class OverrideRolesDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5220837498262961229L;
	List<String> overrideRoles;
	
	public OverrideRolesDTO() {
	}

	public List<String> getOverrideRoles() {
		return overrideRoles;
	}

	public void setOverrideRoles(List<String> overrideRoles) {
		this.overrideRoles = overrideRoles;
	}
}
