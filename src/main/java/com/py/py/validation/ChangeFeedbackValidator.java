package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.admin.ChangeFeedbackDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangeFeedbackValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeFeedbackDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangeFeedbackDTO dto = (ChangeFeedbackDTO) target;
		ValidationCheckUtil.validateIdsList(dto.getIds(), errors);
		// allow all fields to be null except id list for batch updating,
		// do not call methods as they require non null values for submission
	}
}
