package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.ChangePasswordUnauthedDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangePasswordUnauthedValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangePasswordUnauthedDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangePasswordUnauthedDTO dto = (ChangePasswordUnauthedDTO) target;
		ValidationCheckUtil.validateConfirmUnauthedPasswords(dto.getNewPassword(), dto.getConfirmNewPassword(), errors);
	}
}
