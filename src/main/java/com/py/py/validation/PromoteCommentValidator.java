package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.PromoteCommentDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class PromoteCommentValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return PromoteCommentDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		PromoteCommentDTO dto = (PromoteCommentDTO) target;
		ValidationCheckUtil.validatePromotion(dto.getPromotion(), errors);
		ValidationCheckUtil.validateWarning(dto.isWarning(), errors);
	}
}
