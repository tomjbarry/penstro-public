package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.admin.SetPasswordDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class SetPasswordValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return SetPasswordDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		SetPasswordDTO dto = (SetPasswordDTO) target;
		ValidationCheckUtil.validatePassword(dto.getPassword(), errors);
	}
}
