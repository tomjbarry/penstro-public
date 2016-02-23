package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.SubmitFeedbackDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class SubmitFeedbackValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return SubmitFeedbackDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		SubmitFeedbackDTO dto = (SubmitFeedbackDTO) target;
		ValidationCheckUtil.validateFeedbackSummary(dto.getSummary(), errors);
		ValidationCheckUtil.validateFeedbackContext(dto.getContext(), errors);
		ValidationCheckUtil.validateFeedbackType(dto.getType(), errors);
	}
}
