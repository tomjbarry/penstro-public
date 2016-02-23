package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.SubmitEditPostingDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class SubmitEditPostingValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return SubmitEditPostingDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		SubmitEditPostingDTO dto = (SubmitEditPostingDTO) target;
		ValidationCheckUtil.validateTitle(dto.getTitle(), errors);
		ValidationCheckUtil.validateContent(dto.getContent(), errors);
		ValidationCheckUtil.validatePreview(dto.getPreview(), errors);
		ValidationCheckUtil.validateImageReference(dto.getImageLink(), dto.getImageWidth(), dto.getImageHeight(), errors);
	}

}
