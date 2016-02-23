package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.ChangeAppreciationResponseDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangeAppreciationResponseValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeAppreciationResponseDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangeAppreciationResponseDTO dto = (ChangeAppreciationResponseDTO) target;
		ValidationCheckUtil.validateAppreciationResponse(dto.getAppreciationResponse(), 
				errors);
		ValidationCheckUtil.validateAppreciationResponseWarning(
				dto.isAppreciationResponseWarning(), errors);
	}
}
