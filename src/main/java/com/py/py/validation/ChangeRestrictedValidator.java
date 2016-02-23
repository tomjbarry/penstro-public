package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.admin.ChangeRestrictedDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangeRestrictedValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeRestrictedDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangeRestrictedDTO dto = (ChangeRestrictedDTO) target;
		ValidationCheckUtil.validateRestrictedTypeAndWord(dto.getWord(), 
				dto.getType(), errors);
	}
}
