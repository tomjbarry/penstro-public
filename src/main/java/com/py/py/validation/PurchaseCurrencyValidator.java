package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.PurchaseCurrencyDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class PurchaseCurrencyValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return PurchaseCurrencyDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		PurchaseCurrencyDTO dto = (PurchaseCurrencyDTO) target;
		ValidationCheckUtil.validatePurchaseCurrency(dto.getAmount(), errors);
	}
}
