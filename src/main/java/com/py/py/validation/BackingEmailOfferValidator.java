package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.BackingEmailOfferDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class BackingEmailOfferValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return BackingEmailOfferDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		BackingEmailOfferDTO dto = (BackingEmailOfferDTO) target;
		ValidationCheckUtil.validateEmail(dto.getEmail(), errors);
		ValidationCheckUtil.validateBackingCost(dto.getAmount(), errors);
	}
}
