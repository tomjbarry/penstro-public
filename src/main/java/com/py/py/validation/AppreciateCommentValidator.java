package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.AppreciateCommentDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class AppreciateCommentValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return AppreciateCommentDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		AppreciateCommentDTO dto = (AppreciateCommentDTO) target;
		ValidationCheckUtil.validateAppreciation(dto.getAppreciation(), errors);
		ValidationCheckUtil.validateWarning(dto.isWarning(), errors);
	}
}
