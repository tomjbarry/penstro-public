package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.SaveLocationDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class SaveLocationValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return SaveLocationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		SaveLocationDTO dto = (SaveLocationDTO) target;
		ValidationCheckUtil.validateLocation(dto.getName(), errors);
	}
}
