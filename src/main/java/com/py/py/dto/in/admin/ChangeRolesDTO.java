package com.py.py.dto.in.admin;

import java.util.List;

import com.py.py.dto.DTO;

public class ChangeRolesDTO extends DTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3491497461317566146L;
	private List<String> roles;
	private List<String> overrideRoles;
	
	public ChangeRolesDTO() {
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
