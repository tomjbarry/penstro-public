package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.admin.ChangeEmailAdminDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangeEmailAdminValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeEmailAdminDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangeEmailAdminDTO dto = (ChangeEmailAdminDTO) target;
		ValidationCheckUtil.validateEmail(dto.getEmail(), errors);
	}
}
