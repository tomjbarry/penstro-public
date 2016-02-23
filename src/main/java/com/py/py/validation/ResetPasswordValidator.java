package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.ResetPasswordDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ResetPasswordValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ResetPasswordDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ResetPasswordDTO dto = (ResetPasswordDTO) target;
		ValidationCheckUtil.validateEmail(dto.getEmail(), errors);
	}
}
