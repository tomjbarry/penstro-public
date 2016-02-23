package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.ChangePasswordDTO;
import com.py.py.validation.constants.ValidationFields;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangePasswordValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangePasswordDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangePasswordDTO dto = (ChangePasswordDTO) target;
		ValidationCheckUtil.validateAnyPassword(dto.getOldPassword(), errors, ValidationFields.PASSWORD_OLD);
		ValidationCheckUtil.validateConfirmPasswords(dto.getOldPassword(), dto.getNewPassword(), dto.getConfirmNewPassword(), errors);
	}
}
