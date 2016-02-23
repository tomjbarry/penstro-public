package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.ChangeProfileDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangeProfileValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeProfileDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangeProfileDTO dto = (ChangeProfileDTO) target;
		ValidationCheckUtil.validateDescription(dto.getDescription(), errors);
		ValidationCheckUtil.validateWarning(dto.isWarning(), errors);
	}
}
