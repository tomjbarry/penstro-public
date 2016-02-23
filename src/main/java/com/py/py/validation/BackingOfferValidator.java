package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.BackingOfferDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class BackingOfferValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return BackingOfferDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		BackingOfferDTO dto = (BackingOfferDTO) target;
		ValidationCheckUtil.validateUsername(dto.getUsername(), errors);
		ValidationCheckUtil.validateBackingCost(dto.getAmount(), errors);
	}
}
