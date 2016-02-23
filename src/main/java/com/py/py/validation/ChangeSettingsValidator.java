package com.py.py.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.py.py.dto.in.ChangeSettingsDTO;
import com.py.py.validation.util.ValidationCheckUtil;

public class ChangeSettingsValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeSettingsDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ChangeSettingsDTO dto = (ChangeSettingsDTO) target;
		ValidationCheckUtil.validateOptions(dto.getOptions(), errors);
		ValidationCheckUtil.validateHiddenNotifications(dto.getHiddenNotificationEvents(), errors);
		ValidationCheckUtil.validateHiddenFeed(dto.getHiddenFeedEvents(), errors);
		ValidationCheckUtil.validateFilters(dto.getFilters(), errors);
		ValidationCheckUtil.validateLanguage(dto.getLanguage(), true, errors);
		ValidationCheckUtil.validateInterfaceLanguage(dto.getInterfaceLanguage(), true, errors);
	}
}
