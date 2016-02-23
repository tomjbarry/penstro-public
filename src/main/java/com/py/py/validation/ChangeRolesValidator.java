package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.admin.ChangeRolesDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangeRolesValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeRolesDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangeRolesDTO dto = (ChangeRolesDTO) target;
		ValidationCheckUtil.validateRoles(dto.getRoles(), errors);
		ValidationCheckUtil.validateOverrideRoles(dto.getRoles(), errors);
	}
}
