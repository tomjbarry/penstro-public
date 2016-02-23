package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.AppreciatePostingDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class AppreciatePostingValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return AppreciatePostingDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		AppreciatePostingDTO dto = (AppreciatePostingDTO) target;
		ValidationCheckUtil.validateAppreciation(dto.getAppreciation(), errors);
		ValidationCheckUtil.validateTags(dto.getTags(), errors);
		ValidationCheckUtil.validateWarning(dto.isWarning(), errors);
	}
}
