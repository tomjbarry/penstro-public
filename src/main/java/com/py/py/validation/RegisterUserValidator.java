package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.RegisterUserDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class RegisterUserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return RegisterUserDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RegisterUserDTO dto = (RegisterUserDTO) target;
		ValidationCheckUtil.validateUsername(dto.getUsername(), errors);
		ValidationCheckUtil.validatePassword(dto.getPassword(), errors);
		ValidationCheckUtil.validateConfirmRegisterPasswords(dto.getPassword(), dto.getConfirmNewPassword(), errors);
		ValidationCheckUtil.validateEmail(dto.getEmail(), errors);
		ValidationCheckUtil.validateAgeMinimum(dto.getAgeMinimum(), errors);
		ValidationCheckUtil.validateRecaptchaResponse(dto.getRecaptchaResponse(), errors);
	}

}
