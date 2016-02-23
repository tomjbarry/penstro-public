package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.ChangePaymentDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangePaymentValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangePaymentDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangePaymentDTO dto = (ChangePaymentDTO) target;
		ValidationCheckUtil.validatePaymentId(dto.getPaymentId(), errors);
		ValidationCheckUtil.validatePassword(dto.getPassword(), errors);
	}
}
