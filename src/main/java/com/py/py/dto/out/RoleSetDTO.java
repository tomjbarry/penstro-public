package com.py.py.dto.out;

import java.util.List;

import com.py.py.dto.DTO;

public class RoleSetDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8963449044025274918L;
	private List<String> roles;
	private List<String> overrideRoles;
	
	public RoleSetDTO() {
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<String> getOverrideRoles() {
		return overrideRoles;
	}

	public void setOverrideRoles(List<String> overrideRoles) {
		this.overrideRoles = overrideRoles;
	}
}
