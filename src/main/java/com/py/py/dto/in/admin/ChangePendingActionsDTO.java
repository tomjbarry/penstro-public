package com.py.py.dto.in.admin;

import java.util.List;

import com.py.py.dto.DTO;

public class ChangePendingActionsDTO extends DTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3079334417615657387L;
	private List<String> pendingActions;
	
	public ChangePendingActionsDTO() {
	}

	public List<String> getPendingActions() {
		return pendingActions;
	}

	public void setPendingActions(List<String> pendingActions) {
		this.pendingActions = pendingActions;
	}
}