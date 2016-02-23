package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.ChangeEmailDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangeEmailValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeEmailDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangeEmailDTO dto = (ChangeEmailDTO) target;
		ValidationCheckUtil.validateEmail(dto.getEmail(), errors);
		ValidationCheckUtil.validatePassword(dto.getPassword(), errors);
	}
}
