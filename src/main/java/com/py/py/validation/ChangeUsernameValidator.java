package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.admin.ChangeUsernameDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangeUsernameValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeUsernameDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangeUsernameDTO dto = (ChangeUsernameDTO) target;
		ValidationCheckUtil.validateUsername(dto.getUsername(), errors);
	}
}
