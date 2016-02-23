package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.admin.ChangeBalanceDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangeBalanceValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeBalanceDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangeBalanceDTO dto = (ChangeBalanceDTO) target;
		ValidationCheckUtil.validateAmount(dto.getAmount(), errors);
	}
}
