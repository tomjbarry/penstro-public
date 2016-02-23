package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.SubmitEditCommentDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class SubmitEditCommentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return SubmitEditCommentDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		SubmitEditCommentDTO dto = (SubmitEditCommentDTO) target;
		ValidationCheckUtil.validateCommentContent(dto.getContent(), errors);
	}
}
