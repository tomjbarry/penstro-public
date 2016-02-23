package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.PromotePostingDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class PromotePostingValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return PromotePostingDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		PromotePostingDTO dto = (PromotePostingDTO) target;
		ValidationCheckUtil.validatePromotion(dto.getPromotion(), errors);
		ValidationCheckUtil.validateTags(dto.getTags(), errors);
		ValidationCheckUtil.validateWarning(dto.isWarning(), errors);
	}
}
