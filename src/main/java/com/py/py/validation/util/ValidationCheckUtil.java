package com.py.py.validation.util;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.validation.Errors;

import com.py.py.constants.DomainRegex;
import com.py.py.constants.ServiceValues;
import com.py.py.enumeration.EVENT_TYPE;
import com.py.py.enumeration.FEEDBACK_CONTEXT;
import com.py.py.enumeration.FEEDBACK_STATE;
import com.py.py.enumeration.FEEDBACK_TYPE;
import com.py.py.enumeration.LOCK_REASON;
import com.py.py.enumeration.RESTRICTED_TYPE;
import com.py.py.enumeration.SETTING_OPTION;
import com.py.py.generic.Filter;
import com.py.py.util.PyUtils;
import com.py.py.validation.constants.ErrorCodes;
import com.py.py.validation.constants.ValidationFields;

/*
 * Must use else if to prevent multiple errors?
 */

public class ValidationCheckUtil {

	private static Object[] createArguments(Object... args) {
		return args;
	}
	
	public static void validateUsername(String username, Errors errors) {
		if(username == null) {
			errors.rejectValue(ValidationFields.USERNAME, ErrorCodes.REQUIRED);
		} else if(username.length() > ServiceValues.USERNAME_MAX) {
			errors.rejectValue(ValidationFields.USERNAME, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.USERNAME_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(username.length() < ServiceValues.USERNAME_MIN) {
			errors.rejectValue(ValidationFields.USERNAME, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.USERNAME_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!username.matches(DomainRegex.USERNAME)) {
			errors.rejectValue(ValidationFields.USERNAME, ErrorCodes.FORMAT_USERNAME);
		}
		
	}
	
	public static void validateBacker(String username, Errors errors) {
		if(username == null) {
			// allow null backers
			return;
		} else if(username.length() > ServiceValues.USERNAME_MAX) {
			errors.rejectValue(ValidationFields.USERNAME, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.USERNAME_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(username.length() < ServiceValues.USERNAME_MIN) {
			errors.rejectValue(ValidationFields.USERNAME, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.USERNAME_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!username.matches(DomainRegex.USERNAME)) {
			errors.rejectValue(ValidationFields.USERNAME, ErrorCodes.FORMAT_USERNAME);
		}
	}
	
	public static void validatePassword(String password, Errors errors) {
		validateAnyPassword(password, errors, ValidationFields.PASSWORD);
	}
	
	public static void validateAnyPassword(String password, Errors errors, String field) {
		if(password == null) {
			errors.rejectValue(field, ErrorCodes.REQUIRED);
		} else if(password.length() > ServiceValues.PASSWORD_MAX) {
			errors.rejectValue(field, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.PASSWORD_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(password.length() < ServiceValues.PASSWORD_MIN) {
			errors.rejectValue(field, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.PASSWORD_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		}/* else if(!password.matches(DomainRegex.PASSWORD)) {
			errors.rejectValue(field, ErrorCodes.FORMAT_PASSWORD);
		}*/
	}
	
	public static void validateConfirmPasswords(String oldPassword, String newPassword, String confirmNewPassword, Errors errors) {
		validateAnyPassword(oldPassword, errors, ValidationFields.PASSWORD_OLD);
		validateAnyPassword(newPassword, errors, ValidationFields.PASSWORD_NEW);
		validateAnyPassword(confirmNewPassword, errors, ValidationFields.PASSWORD_CONFIRM);
		if(!errors.hasErrors()) {
			if(!PyUtils.stringCompare(newPassword, confirmNewPassword)) {
				errors.rejectValue(ValidationFields.PASSWORD_CONFIRM, ErrorCodes.MATCH_CONFIRM);
			}
		}
	}
	
	public static void validateConfirmUnauthedPasswords(String newPassword, String confirmNewPassword, Errors errors) {
		validateAnyPassword(newPassword, errors, ValidationFields.PASSWORD_NEW);
		validateAnyPassword(confirmNewPassword, errors, ValidationFields.PASSWORD_CONFIRM);
		if(!errors.hasErrors()) {
			if(!PyUtils.stringCompare(newPassword, confirmNewPassword)) {
				errors.rejectValue(ValidationFields.PASSWORD_CONFIRM, ErrorCodes.MATCH_CONFIRM);
			}
		}
	}
	
	public static void validateConfirmRegisterPasswords(String password, String confirmNewPassword, Errors errors) {
		validateAnyPassword(password, errors, ValidationFields.PASSWORD);
		validateAnyPassword(confirmNewPassword, errors, ValidationFields.PASSWORD_CONFIRM);
		if(!errors.hasErrors()) {
			if(!PyUtils.stringCompare(password, confirmNewPassword)) {
				errors.rejectValue(ValidationFields.PASSWORD_CONFIRM, ErrorCodes.MATCH_CONFIRM);
			}
		}
	}
	
	public static void validateEmail(String email, Errors errors) {
		if(email == null) {
			errors.rejectValue(ValidationFields.EMAIL, ErrorCodes.REQUIRED);
		} else if(email.length() > ServiceValues.EMAIL_MAX) {
			errors.rejectValue(ValidationFields.EMAIL, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.EMAIL_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(email.length() < ServiceValues.EMAIL_MIN) {
			errors.rejectValue(ValidationFields.EMAIL,ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.EMAIL_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!email.matches(DomainRegex.EMAIL)) {
			errors.rejectValue(ValidationFields.EMAIL, ErrorCodes.FORMAT_EMAIL);
		}
	}
	
	public static void validatePaymentId(String paymentId, Errors errors) {
		if(paymentId == null) {
			return;
		} else if(paymentId.length() > ServiceValues.PAYMENT_ID_MAX) {
			errors.rejectValue(ValidationFields.PAYMENT_ID, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.PAYMENT_ID_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(paymentId.length() < ServiceValues.PAYMENT_ID_MIN) {
			errors.rejectValue(ValidationFields.PAYMENT_ID,ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.PAYMENT_ID_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!paymentId.matches(DomainRegex.PAYMENT_ID)) {
			errors.rejectValue(ValidationFields.PAYMENT_ID, ErrorCodes.FORMAT_PAYMENT_ID);
		}
	}
	
	public static void validateAgeMinimum(Boolean ageMinimum, Errors errors) {
		if(ageMinimum == null) {
			errors.rejectValue(ValidationFields.AGE_MINIMUM, ErrorCodes.REQUIRED);
		} else if(!ageMinimum) {
			errors.rejectValue(ValidationFields.AGE_MINIMUM, ErrorCodes.REQUIRED);
		}
	}
	
	public static void validateRecaptchaResponse(String recaptchaResponse, Errors errors) {
		if(recaptchaResponse == null) {
			errors.rejectValue(ValidationFields.RECAPTCHA_RESPONSE, ErrorCodes.REQUIRED);
		} else if(recaptchaResponse.length() < ServiceValues.RECAPTCHA_RESPONSE_MIN) {
			errors.rejectValue(ValidationFields.RECAPTCHA_RESPONSE, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.RECAPTCHA_RESPONSE_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		}
	}
	
	public static void validateTitle(String title, Errors errors) {
		if(title == null) {
			errors.rejectValue(ValidationFields.TITLE, ErrorCodes.REQUIRED);
		} else if(title.length() > ServiceValues.TITLE_MAX) {
			errors.rejectValue(ValidationFields.TITLE, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.TITLE_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(title.length() < ServiceValues.TITLE_MIN) {
			errors.rejectValue(ValidationFields.TITLE, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.TITLE_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		}
	}
	
	public static void validateTarget(String target, Errors errors) {
		if(target == null) {
			errors.rejectValue(ValidationFields.TARGET, ErrorCodes.REQUIRED);
		} else if(target.length() > ServiceValues.USERNAME_MAX) {
			errors.rejectValue(ValidationFields.TARGET, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.USERNAME_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(target.length() < ServiceValues.USERNAME_MIN) {
			errors.rejectValue(ValidationFields.TARGET,ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.USERNAME_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!target.matches(DomainRegex.USERNAME)) {
			errors.rejectValue(ValidationFields.TARGET, ErrorCodes.FORMAT_USERNAME);
		}
	}
	
	public static void validateDescription(String description, Errors errors) {
		if(description == null) {
			errors.rejectValue(ValidationFields.DESCRIPTION, ErrorCodes.REQUIRED);
		} else if(description.length() > ServiceValues.DESCRIPTION_MAX) {
			errors.rejectValue(ValidationFields.DESCRIPTION, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.DESCRIPTION_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(description.length() < ServiceValues.DESCRIPTION_MIN) {
			errors.rejectValue(ValidationFields.DESCRIPTION, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.DESCRIPTION_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!description.matches(DomainRegex.DESCRIPTION)) {
			errors.rejectValue(ValidationFields.DESCRIPTION, ErrorCodes.FORMAT);
		}
	}
	
	public static void validateAppreciationResponse(String appreciationResponse,
			Errors errors) {
		if(appreciationResponse == null && ServiceValues.APPRECIATION_RESPONSE_MIN >= 0) {
			errors.rejectValue(ValidationFields.APPRECIATION_RESPONSE, 
					ErrorCodes.REQUIRED);
		} else if(appreciationResponse.length() > ServiceValues.APPRECIATION_RESPONSE_MAX) {
			errors.rejectValue(ValidationFields.APPRECIATION_RESPONSE, 
					ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.APPRECIATION_RESPONSE_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(appreciationResponse.length() < ServiceValues.APPRECIATION_RESPONSE_MIN) {
			errors.rejectValue(ValidationFields.APPRECIATION_RESPONSE, 
					ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.APPRECIATION_RESPONSE_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!appreciationResponse.matches(DomainRegex.APPRECIATION_RESPONSE)) {
			errors.rejectValue(ValidationFields.APPRECIATION_RESPONSE, ErrorCodes.FORMAT);
		}
	}
	
	public static void validateContent(String content, Errors errors) {
		if(content == null) {
			errors.rejectValue(ValidationFields.CONTENT, ErrorCodes.REQUIRED);
		} else if(content.length() > ServiceValues.CONTENT_MAX) {
			errors.rejectValue(ValidationFields.CONTENT, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.CONTENT_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(content.length() < ServiceValues.CONTENT_MIN) {
			errors.rejectValue(ValidationFields.CONTENT, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.CONTENT_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!content.matches(DomainRegex.CONTENT)) {
			errors.rejectValue(ValidationFields.CONTENT, ErrorCodes.FORMAT);
		}
	}
	
	public static void validateCommentContent(String content, Errors errors) {
		if(content == null) {
			errors.rejectValue(ValidationFields.CONTENT, ErrorCodes.REQUIRED);
		} else if(content.length() > ServiceValues.COMMENT_CONTENT_MAX) {
			errors.rejectValue(ValidationFields.CONTENT, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.COMMENT_CONTENT_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(content.length() < ServiceValues.COMMENT_CONTENT_MIN) {
			errors.rejectValue(ValidationFields.CONTENT, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.COMMENT_CONTENT_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!content.matches(DomainRegex.CONTENT)) {
			errors.rejectValue(ValidationFields.CONTENT, ErrorCodes.FORMAT);
		}
	}
	
	public static void validateEdit(String edit, Errors errors) {
		if(edit == null) {
			//errors.rejectValue(ValidationFields.EDIT, ErrorCodes.REQUIRED);
		} else if(edit.length() > ServiceValues.EDIT_MAX) {
			errors.rejectValue(ValidationFields.EDIT, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.EDIT_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(edit.length() < ServiceValues.EDIT_MIN) {
			errors.rejectValue(ValidationFields.EDIT, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.EDIT_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!edit.matches(DomainRegex.EDIT)) {
			errors.rejectValue(ValidationFields.EDIT, ErrorCodes.FORMAT);
		}
	}
	
	public static void validateMessage(String content, Errors errors) {
		if(content == null) {
			errors.rejectValue(ValidationFields.MESSAGE, ErrorCodes.REQUIRED);
		} else if(content.length() > ServiceValues.MESSAGE_MAX) {
			errors.rejectValue(ValidationFields.MESSAGE, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.MESSAGE_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(content.length() < ServiceValues.MESSAGE_MIN) {
			errors.rejectValue(ValidationFields.MESSAGE,ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.MESSAGE_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		}
	}
	
	public static void validatePreview(String preview, Errors errors) {
		if(preview == null) {
			//errors.rejectValue(ValidationFields.PREVIEW, ErrorCodes.REQUIRED);
		} else if(preview.length() > ServiceValues.PREVIEW_MAX) {
			errors.rejectValue(ValidationFields.PREVIEW, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.PREVIEW_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(preview.length() < ServiceValues.PREVIEW_MIN) {
			errors.rejectValue(ValidationFields.PREVIEW, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.PREVIEW_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!preview.matches(DomainRegex.PREVIEW)) {
			errors.rejectValue(ValidationFields.PREVIEW, ErrorCodes.FORMAT);
		}
	}
	
	public static void validateCurrency(String currency, Errors errors) {
		if(currency == null) {
			errors.rejectValue(ValidationFields.CURRENCY, ErrorCodes.REQUIRED);
		}
		
		if(!Validation.validCurrency(currency)) {
			errors.rejectValue(ValidationFields.CURRENCY, ErrorCodes.INCORRECT_CURRENCY);
		}
	}
	
	public static void validateAmount(Long amount, Errors errors) {
		// used for specifying an amount, but NOT for purchases of any sort
		if(amount == null) {
			errors.rejectValue(ValidationFields.AMOUNT, ErrorCodes.REQUIRED);
		} else if(amount > ServiceValues.AMOUNT_MAX) {
			errors.rejectValue(ValidationFields.AMOUNT, ErrorCodes.SIZE_LARGE,
					createArguments(ServiceValues.AMOUNT_MAX),
					ErrorCodes.SIZE_LARGE_DEFAULT);
		} else if(amount < ServiceValues.AMOUNT_MIN) {
			errors.rejectValue(ValidationFields.AMOUNT, ErrorCodes.SIZE_SMALL,
					createArguments(ServiceValues.AMOUNT_MIN),
					ErrorCodes.SIZE_SMALL_DEFAULT);
		}
	}
	
	public static void validateCost(Long cost, Errors errors) {
		if(cost == null) {
			errors.rejectValue(ValidationFields.COST, ErrorCodes.REQUIRED);
		} else if(cost > ServiceValues.COST_MAX) {
			errors.rejectValue(ValidationFields.COST, ErrorCodes.SIZE_LARGE,
					createArguments(ServiceValues.COST_MAX),
					ErrorCodes.SIZE_LARGE_DEFAULT);
		} else if(cost < ServiceValues.COST_MIN) {
			errors.rejectValue(ValidationFields.COST,ErrorCodes.SIZE_SMALL,
					createArguments(ServiceValues.COST_MIN),
					ErrorCodes.SIZE_SMALL_DEFAULT);
		}
	}
	
	public static void validateCommentCost(Long cost, Errors errors) {
		if(cost == null) {
			errors.rejectValue(ValidationFields.COST_COMMENT, ErrorCodes.REQUIRED);
		} else if(cost > ServiceValues.COST_COMMENT_MAX) {
			errors.rejectValue(ValidationFields.COST_COMMENT, ErrorCodes.SIZE_LARGE,
					createArguments(ServiceValues.COST_COMMENT_MAX),
					ErrorCodes.SIZE_LARGE_DEFAULT);
		} else if(cost < ServiceValues.COST_COMMENT_MIN) {
			errors.rejectValue(ValidationFields.COST_COMMENT,ErrorCodes.SIZE_SMALL,
					createArguments(ServiceValues.COST_COMMENT_MIN),
					ErrorCodes.SIZE_SMALL_DEFAULT);
		}
	}
	
	public static void validatePurchaseCurrency(Long amount, Errors errors) {
		// perhaps offer only specific denominations, or a list of sizes
		if(amount == null) {
			errors.rejectValue(ValidationFields.AMOUNT, ErrorCodes.REQUIRED);
		} else if(amount > ServiceValues.PURCHASE_CURRENCY_MAX) {
			errors.rejectValue(ValidationFields.AMOUNT, ErrorCodes.SIZE_LARGE,
					createArguments(ServiceValues.PURCHASE_CURRENCY_MAX),
					ErrorCodes.SIZE_LARGE_DEFAULT);
		} else if(amount < ServiceValues.PURCHASE_CURRENCY_MIN) {
			errors.rejectValue(ValidationFields.AMOUNT,ErrorCodes.SIZE_SMALL,
					createArguments(ServiceValues.PURCHASE_CURRENCY_MIN),
					ErrorCodes.SIZE_SMALL_DEFAULT);
		}
	}
	
	public static void validateAppreciation(String appreciation, Errors errors) {
		if(appreciation == null) {
			errors.rejectValue(ValidationFields.APPRECIATION, ErrorCodes.REQUIRED);
		}

		try {
			BigDecimal appreciationBd = new BigDecimal(appreciation);
			if(appreciationBd.doubleValue() > ServiceValues.APPRECIATE_MAX) {
				errors.rejectValue(ValidationFields.APPRECIATION, ErrorCodes.SIZE_LARGE,
						createArguments(ServiceValues.APPRECIATE_MAX),
						ErrorCodes.SIZE_LARGE_DEFAULT);
			} else if(appreciationBd.doubleValue() < ServiceValues.APPRECIATE_MIN) {
				errors.rejectValue(ValidationFields.APPRECIATION,ErrorCodes.SIZE_SMALL,
						createArguments(ServiceValues.APPRECIATE_MIN),
						ErrorCodes.SIZE_SMALL_DEFAULT);
			}
		} catch(Exception e) {
			errors.rejectValue(ValidationFields.APPRECIATION, ErrorCodes.FORMAT_DECIMAL);
		}
	}
	
	public static void validatePromotion(Long promotion, Errors errors) {
		if(promotion == null) {
			errors.rejectValue(ValidationFields.PROMOTION, ErrorCodes.REQUIRED);
		} else if(promotion > ServiceValues.PROMOTE_MAX) {
			errors.rejectValue(ValidationFields.PROMOTION, ErrorCodes.SIZE_LARGE,
					createArguments(ServiceValues.PROMOTE_MAX),
					ErrorCodes.SIZE_LARGE_DEFAULT);
		} else if(promotion < ServiceValues.PROMOTE_MIN) {
			errors.rejectValue(ValidationFields.PROMOTION,ErrorCodes.SIZE_SMALL,
					createArguments(ServiceValues.PROMOTE_MIN),
					ErrorCodes.SIZE_SMALL_DEFAULT);
		}
	}
	
	public static void validateBackingCost(Long cost, Errors errors) {
		if(cost == null) {
			errors.rejectValue(ValidationFields.BACKING_COST, ErrorCodes.REQUIRED);
		} else if(cost > ServiceValues.BACKING_COST_MAX) {
			errors.rejectValue(ValidationFields.BACKING_COST, ErrorCodes.SIZE_LARGE,
					createArguments(ServiceValues.BACKING_COST_MIN),
					ErrorCodes.SIZE_LARGE_DEFAULT);
		} else if(cost < ServiceValues.BACKING_COST_MIN) {
			errors.rejectValue(ValidationFields.BACKING_COST,ErrorCodes.SIZE_SMALL,
					createArguments(ServiceValues.BACKING_COST_MIN),
					ErrorCodes.SIZE_SMALL_DEFAULT);
		}
	}
	
	public static void validateTagString(String tags, Errors errors) {
		if(tags == null) {
			/*
			if(ServiceValues.TAGS_MIN > 0) {
				errors.rejectValue(ValidationFields.TAGS, ErrorCodes.REQUIRED);
			}*/
			return;
		}
		
		List<String> tagList;
		try {
			tagList = PyUtils.getTags(tags);
		} catch(Exception e) {
			errors.rejectValue(ValidationFields.TAGS, ErrorCodes.FORMAT);
			return;
		}
		
		validateTags(tagList, errors);
	}
	
	public static void validateTags(List<String> tags, Errors errors) {
		if(tags == null) {
			/*
			if(ServiceValues.TAGS_MIN > 0) {
				errors.rejectValue(ValidationFields.TAGS, ErrorCodes.REQUIRED);
			}*/
			return;
		}
		if(tags.size() > ServiceValues.TAGS_MAX) {
			errors.rejectValue(ValidationFields.TAGS,ErrorCodes.LENGTH_TAGS_LONG,
					createArguments(ServiceValues.TAGS_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if (tags.size() < ServiceValues.TAGS_MIN){
			errors.rejectValue(ValidationFields.TAGS,ErrorCodes.LENGTH_TAGS_SHORT,
					createArguments(ServiceValues.TAGS_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		}
		for(String tag : tags) {
			validateTag(tag, errors);
		}
	}
	
	public static void validateTag(String tag, Errors errors) {
		if(tag == null) {
			errors.rejectValue(ValidationFields.TAGS, ErrorCodes.FORMAT);
		} else if(tag.length() > ServiceValues.TAG_MAX) {
			errors.rejectValue(ValidationFields.TAGS, ErrorCodes.LENGTH_TAG_LONG,
					createArguments(tag, ServiceValues.TAG_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(tag.length() < ServiceValues.TAG_MIN) {
			errors.rejectValue(ValidationFields.TAGS, ErrorCodes.LENGTH_TAG_SHORT,
					createArguments(tag, ServiceValues.TAG_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!tag.matches(DomainRegex.TAG)) {
			errors.rejectValue(ValidationFields.TAGS, ErrorCodes.FORMAT_TAG,
					createArguments(tag),
					ErrorCodes.FORMAT);
		}
	}
	
	public static void validateOptions(Map<SETTING_OPTION, Boolean> options, Errors errors) {
		if(!Validation.validOptions(options)) {
			errors.rejectValue(ValidationFields.OPTIONS, ErrorCodes.FORMAT);
		}
	}
	
	public static void validateHiddenNotifications(List<EVENT_TYPE> types, Errors errors) {
		if(!Validation.validHiddenNotifications(types)) {
			errors.rejectValue(ValidationFields.HIDDEN_NOTIFICATIONS, ErrorCodes.FORMAT);
		}
	}
	
	public static void validateHiddenFeed(List<EVENT_TYPE> types, Errors errors) {
		if(!Validation.validHiddenFeed(types)) {
			errors.rejectValue(ValidationFields.HIDDEN_FEED, ErrorCodes.FORMAT);
		}
	}
	
	public static void validateFilters(List<Filter> filters, Errors errors) {
		if(!Validation.validFilters(filters)) {
			errors.rejectValue(ValidationFields.HIDDEN_FEED, ErrorCodes.FORMAT);
		}
	}
	
	public static void validateWarning(Boolean warning, Errors errors) {
		if(warning == null) {
			errors.rejectValue(ValidationFields.WARNING, ErrorCodes.REQUIRED);
		}
	}
	
	public static void validateAppreciationResponseWarning(Boolean warning, Errors errors) {
		if(warning == null) {
			errors.rejectValue(ValidationFields.APPRECIATION_RESPONSE_WARNING, ErrorCodes.REQUIRED);
		}
	}
	
	public static void validateFeedbackSummary(String summary, Errors errors) {
		if(summary == null) {
			errors.rejectValue(ValidationFields.SUMMARY, ErrorCodes.REQUIRED);
		} else if(summary.length() > ServiceValues.SUMMARY_MAX) {
			errors.rejectValue(ValidationFields.SUMMARY, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.SUMMARY_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(summary.length() < ServiceValues.SUMMARY_MIN) {
			errors.rejectValue(ValidationFields.SUMMARY, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.SUMMARY_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		}
	}
	
	public static void validateFeedbackType(FEEDBACK_TYPE type, Errors errors) {
		if(type == null) {
			errors.rejectValue(ValidationFields.TYPE, ErrorCodes.REQUIRED);
		}
	}
	
	public static void validateFeedbackState(FEEDBACK_STATE state, Errors errors) {
		if(state == null) {
			errors.rejectValue(ValidationFields.STATE, ErrorCodes.REQUIRED);
		}
	}
	
	public static void validateFeedbackContext(FEEDBACK_CONTEXT context, Errors errors) {
		if(context == null) {
			errors.rejectValue(ValidationFields.CONTEXT, ErrorCodes.REQUIRED);
		}
	}

	public static void validateLockReason(LOCK_REASON reason, Errors errors) {
		if(reason == null) {
			errors.rejectValue(ValidationFields.LOCK_REASON, ErrorCodes.REQUIRED);
		}
	}
	
	public static void validatePendingActions(List<String> pendingActions, Errors errors) {
		if(pendingActions == null) {
			return;
			//errors.rejectValue(ValidationFields.PENDING_ACTIONS, ErrorCodes.REQUIRED);
		} else if(!Validation.validPendingActions(pendingActions)) {
			errors.rejectValue(ValidationFields.PENDING_ACTIONS, ErrorCodes.INVALID);
		}
	}
	
	public static void validateRoles(List<String> roles, Errors errors) {
		if(roles == null) {
			return;
			//errors.rejectValue(ValidationFields.ROLES, ErrorCodes.REQUIRED);
		} else if(!Validation.validRoles(roles)) {
			errors.rejectValue(ValidationFields.ROLES, ErrorCodes.INVALID);
		}
	}
	
	public static void validateOverrideRoles(List<String> overrideRoles, Errors errors) {
		if(overrideRoles == null) {
			return;
			//errors.rejectValue(ValidationFields.OVERRIDE_ROLES, ErrorCodes.REQUIRED);
		} else if(!Validation.validRoles(overrideRoles)) {
			errors.rejectValue(ValidationFields.OVERRIDE_ROLES, ErrorCodes.INVALID);
		}
	}
	
	public static void validateLocation(String locationName, Errors errors) {
		if(locationName == null) {
			errors.rejectValue(ValidationFields.LOCATION_NAME, ErrorCodes.REQUIRED);
		}
	}
	
	public static void validateRestrictedTypeAndWord(String word, RESTRICTED_TYPE type, 
			Errors errors) {
		validateRestrictedType(type, errors);
		
		if(word == null) {
			errors.rejectValue(ValidationFields.WORD, ErrorCodes.REQUIRED);
		} else if(word.length() > ServiceValues.WORD_MAX) {
			errors.rejectValue(ValidationFields.WORD, ErrorCodes.LENGTH_LONG,
					createArguments(ServiceValues.WORD_MAX),
					ErrorCodes.LENGTH_LONG_DEFAULT);
		} else if(word.length() < ServiceValues.WORD_MIN) {
			errors.rejectValue(ValidationFields.WORD, ErrorCodes.LENGTH_SHORT,
					createArguments(ServiceValues.WORD_MIN),
					ErrorCodes.LENGTH_SHORT_DEFAULT);
		} else if(!Validation.validWord(word)) {
			errors.rejectValue(ValidationFields.WORD, ErrorCodes.INVALID);
		}
		if(RESTRICTED_TYPE.USERNAME.equals(type)) {
			if(!Validation.validUsername(word)) {
				errors.rejectValue(ValidationFields.WORD, ErrorCodes.INVALID);
			}
		} else if(RESTRICTED_TYPE.PASSWORD.equals(type)) {
			if(!Validation.validPassword(word)) {
				errors.rejectValue(ValidationFields.WORD, ErrorCodes.INVALID);
			}
		} else if(RESTRICTED_TYPE.EMAIL.equals(type)) {
			if(!Validation.validEmail(word)) {
				errors.rejectValue(ValidationFields.WORD, ErrorCodes.INVALID);
			}
		}
	}
	
	public static void validateRestrictedType(RESTRICTED_TYPE type, Errors errors) {
		if(type == null) {
			errors.rejectValue(ValidationFields.TYPE, ErrorCodes.REQUIRED);
		}
	}
	
	public static void validateIdsList(List<String> ids, Errors errors) {
		if(ids == null) {
			errors.rejectValue(ValidationFields.IDS, ErrorCodes.REQUIRED);
		} else if(PyUtils.objectIdList(ids).size() < ids.size()) {
			errors.rejectValue(ValidationFields.IDS, ErrorCodes.INVALID);
		}
	}
	
	public static void validateLanguage(String language, boolean allowNull, Errors errors) {
		if(language == null || language.isEmpty()) {
			if(!allowNull) {
				errors.rejectValue(ValidationFields.LANGUAGE, ErrorCodes.REQUIRED);
			}
		} else if(!Validation.validLanguage(language)) {
			errors.rejectValue(ValidationFields.LANGUAGE, ErrorCodes.INVALID);
		}
	}
	
	public static void validateInterfaceLanguage(String language, boolean allowNull, Errors errors) {
		if(language == null || language.isEmpty()) {
			if(!allowNull) {
				errors.rejectValue(ValidationFields.INTERFACE_LANGUAGE, ErrorCodes.REQUIRED);
			}
		} else if(!Validation.validLanguage(language)) {
			errors.rejectValue(ValidationFields.INTERFACE_LANGUAGE, ErrorCodes.INVALID);
		}
	}
	
	public static void validateImageReference(String imageLink, Integer imageWidth, Integer imageHeight, Errors errors) {
		if(imageLink != null) {
			if(imageLink.length() > ServiceValues.IMAGE_LINK_MAX) {
				errors.rejectValue(ValidationFields.IMAGE_LINK, ErrorCodes.LENGTH_LONG,
						createArguments(ServiceValues.IMAGE_LINK_MAX),
						ErrorCodes.LENGTH_LONG_DEFAULT);
			} else if(!imageLink.matches(DomainRegex.IMAGE_LINK)) {
				errors.rejectValue(ValidationFields.IMAGE_LINK, ErrorCodes.FORMAT);
			}
			if(imageWidth != null) {
				if(imageWidth > ServiceValues.IMAGE_WIDTH_MAX) {
					errors.rejectValue(ValidationFields.IMAGE_WIDTH, ErrorCodes.SIZE_LARGE,
							createArguments(ServiceValues.IMAGE_WIDTH_MAX),
							ErrorCodes.SIZE_LARGE_DEFAULT);
				} else if(imageWidth < ServiceValues.IMAGE_WIDTH_MIN) {
					errors.rejectValue(ValidationFields.IMAGE_WIDTH, ErrorCodes.SIZE_SMALL,
							createArguments(ServiceValues.IMAGE_WIDTH_MIN),
							ErrorCodes.SIZE_SMALL_DEFAULT);
				}
			}
			if(imageHeight != null) {
				if(imageHeight > ServiceValues.IMAGE_HEIGHT_MAX) {
					errors.rejectValue(ValidationFields.IMAGE_HEIGHT, ErrorCodes.SIZE_LARGE,
							createArguments(ServiceValues.IMAGE_HEIGHT_MAX),
							ErrorCodes.SIZE_LARGE_DEFAULT);
				} else if(imageHeight < ServiceValues.IMAGE_HEIGHT_MIN) {
					errors.rejectValue(ValidationFields.IMAGE_HEIGHT, ErrorCodes.SIZE_SMALL,
							createArguments(ServiceValues.IMAGE_HEIGHT_MIN),
							ErrorCodes.SIZE_SMALL_DEFAULT);
				}
			}
		}
		
	}
	
}
