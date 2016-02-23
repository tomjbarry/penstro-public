package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.SubmitMessageDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class SubmitMessageValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return SubmitMessageDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		SubmitMessageDTO dto = (SubmitMessageDTO) target;
		ValidationCheckUtil.validateMessage(dto.getMessage(), errors);
		
	}

}
