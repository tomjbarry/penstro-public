package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.admin.LockUserDTO;

public class LockUserValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return LockUserDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//LockUserDTO dto = (LockUserDTO) target;
		// do not validate date, reason,  or suspensions. 
		// allow them to be null or even negative
	}
}
