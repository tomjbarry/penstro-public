package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.admin.ChangePendingActionsDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangePendingActionsValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangePendingActionsDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangePendingActionsDTO dto = (ChangePendingActionsDTO) target;
		ValidationCheckUtil.validatePendingActions(dto.getPendingActions(), errors);
	}
}