package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.SubmitCommentDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class SubmitCommentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return SubmitCommentDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		SubmitCommentDTO dto = (SubmitCommentDTO) target;
		ValidationCheckUtil.validateCommentContent(dto.getContent(), errors);
		ValidationCheckUtil.validateCommentCost(dto.getCost(), errors);
		ValidationCheckUtil.validateBacker(dto.getBacker(), errors);
		ValidationCheckUtil.validateWarning(dto.isWarning(), errors);
	}
}
