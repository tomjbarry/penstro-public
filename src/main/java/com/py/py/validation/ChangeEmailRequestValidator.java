package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.ChangeEmailRequestDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangeEmailRequestValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeEmailRequestDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangeEmailRequestDTO dto = (ChangeEmailRequestDTO) target;
		ValidationCheckUtil.validatePassword(dto.getPassword(), errors);
	}
}
