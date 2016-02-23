package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.admin.ChangeTallyDTO;

public class ChangeTallyValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeTallyDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// ChangeTallyDTO dto = (ChangeTallyDTO) target;
		// no validation necessary, they can be large, small, or even negative or 0
	}
}
