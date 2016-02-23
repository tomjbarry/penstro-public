package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.SubmitPostingDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class SubmitPostingValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return SubmitPostingDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		SubmitPostingDTO dto = (SubmitPostingDTO) target;
		ValidationCheckUtil.validateTitle(dto.getTitle(), errors);
		ValidationCheckUtil.validateContent(dto.getContent(), errors);
		ValidationCheckUtil.validatePreview(dto.getPreview(), errors);
		ValidationCheckUtil.validateTags(dto.getTags(), errors);
		ValidationCheckUtil.validateCost(dto.getCost(), errors);
		ValidationCheckUtil.validateBacker(dto.getBacker(), errors);
		ValidationCheckUtil.validateWarning(dto.isWarning(), errors);
		ValidationCheckUtil.validateImageReference(dto.getImageLink(), dto.getImageWidth(), dto.getImageHeight(), errors);
	}

}
