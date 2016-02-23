package com.py.py.validation.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.py.py.constants.CurrencyNames;
import com.py.py.constants.DomainRegex;
import com.py.py.constants.OverrideRoleNames;
import com.py.py.constants.PendingActions;
import com.py.py.constants.RoleNames;
import com.py.py.constants.ServiceValues;
import com.py.py.enumeration.EVENT_TYPE;
import com.py.py.enumeration.SETTING_OPTION;
import com.py.py.generic.Filter;
import com.py.py.util.PyUtils;

public class Validation {

	private static Map<String, String> pendingActionMap = 
			PyUtils.constructConstantMap(PendingActions.class);
	private static Map<String, String> roleMap = 
			PyUtils.constructConstantMap(RoleNames.class);
	private static Map<String, String> overrideRoleMap = 
			PyUtils.constructConstantMap(OverrideRoleNames.class);
	private static Map<String, String> currencyMap = 
			PyUtils.constructConstantMap(CurrencyNames.class);
	private static List<String> languageList = 
			Collections.unmodifiableList(Arrays.asList(Locale.getISOLanguages()));
	
	public static boolean validUsername(String username) {
		if(username == null || !validUsernameLength(username) ||
				!validUsernameMatch(username)) {
			return false;
		}
		return true;
	}
	
	public static boolean validUsernameLength(String username) {
		if(username.length() < ServiceValues.USERNAME_MIN || 
				username.length() > ServiceValues.USERNAME_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validUsernameMatch(String username) {
		if(!username.matches(DomainRegex.USERNAME)) {
			return false;
		}
		return true;
	}
	
	public static boolean validPassword(String password) {
		if(password == null || !validPasswordLength(password) ||
				!validPasswordMatch(password)) {
			return false;
		}
		return true;
	}
	
	public static boolean validPasswordLength(String password) {
		if(password.length() < ServiceValues.PASSWORD_MIN || 
				password.length() > ServiceValues.PASSWORD_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validPasswordMatch(String password) {
		/*if(!password.matches(DomainRegex.PASSWORD)) {
			return false;
		}*/
		return true;
	}
	
	public static boolean validEmail(String email) {
		if(email == null || !validEmailLength(email) ||
				!validEmailMatch(email)) {
			return false;
		}
		return true;
	}
	
	public static boolean validEmailLength(String email) {
		if(email.length() < ServiceValues.EMAIL_MIN || 
				email.length() > ServiceValues.EMAIL_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validEmailMatch(String email) {
		if(!email.matches(DomainRegex.EMAIL)) {
			return false;
		}
		return true;
	}
	
	public static boolean validPaymentId(String paymentId) {
		if(paymentId == null) {
			return true;
		}
		if(!validPaymentIdLength(paymentId) ||
				!validPaymentIdMatch(paymentId)) {
			return false;
		}
		return true;
	}
	
	public static boolean validPaymentIdLength(String paymentId) {
		if(paymentId.length() < ServiceValues.PAYMENT_ID_MIN || 
				paymentId.length() > ServiceValues.PAYMENT_ID_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validPaymentIdMatch(String paymentId) {
		if(!paymentId.matches(DomainRegex.PAYMENT_ID)) {
			return false;
		}
		return true;
	}
	
	public static boolean validTitle(String title) {
		if(title == null || !validTitleLength(title) ||
				!validTitleMatch(title)) {
			return false;
		}
		return true;
	}
	
	public static boolean validTitleLength(String title) {
		if(title.length() < ServiceValues.TITLE_MIN || 
				title.length() > ServiceValues.TITLE_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validTitleMatch(String title) {
		if(!title.matches(DomainRegex.TITLE)) {
			return false;
		}
		return true;
	}
	
	public static boolean validContent(String content) {
		if(content == null || !validContentLength(content) ||
				!validContentMatch(content)) {
			return false;
		}
		return true;
	}
	
	public static boolean validContentLength(String content) {
		if(content.length() < ServiceValues.CONTENT_MIN || 
				content.length() > ServiceValues.CONTENT_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validContentMatch(String content) {
		if(!content.matches(DomainRegex.CONTENT)) {
			return false;
		}
		return true;
	}
	
	public static boolean validCommentContent(String content) {
		if(content == null || !validCommentContentLength(content) ||
				!validCommentContentMatch(content)) {
			return false;
		}
		return true;
	}
	
	public static boolean validCommentContentLength(String content) {
		if(content.length() < ServiceValues.COMMENT_CONTENT_MIN || 
				content.length() > ServiceValues.COMMENT_CONTENT_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validCommentContentMatch(String content) {
		if(!content.matches(DomainRegex.CONTENT)) {
			return false;
		}
		return true;
	}
	
	public static boolean validEdit(String edit) {
		if(edit == null) {
			return true;
		}
		if(!validEditLength(edit) || !validEditMatch(edit)) {
			return false;
		}
		return true;
	}
	
	public static boolean validEditLength(String edit) {
		if(edit.length() < ServiceValues.EDIT_MIN || 
				edit.length() > ServiceValues.EDIT_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validEditMatch(String edit) {
		if(!edit.matches(DomainRegex.EDIT)) {
			return false;
		}
		return true;
	}
	
	public static boolean validPreview(String preview) {
		if(preview == null) {
			return true;
		}
		if(!validPreviewLength(preview) || !validPreviewMatch(preview)) {
			return false;
		}
		return true;
	}
	
	public static boolean validPreviewLength(String preview) {
		if(preview.length() < ServiceValues.PREVIEW_MIN || 
				preview.length() > ServiceValues.PREVIEW_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validPreviewMatch(String preview) {
		if(!preview.matches(DomainRegex.PREVIEW)) {
			return false;
		}
		return true;
	}
	
	public static boolean validDescription(String description) {
		if(description == null || !validDescriptionLength(description) ||
				!validDescriptionMatch(description)) {
			return false;
		}
		return true;
	}
	
	public static boolean validDescriptionLength(String description) {
		if(description.length() < ServiceValues.DESCRIPTION_MIN || 
				description.length() > ServiceValues.DESCRIPTION_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validDescriptionMatch(String description) {
		if(!description.matches(DomainRegex.DESCRIPTION)) {
			return false;
		}
		return true;
	}
	
	public static boolean validAppreciationResponse(String appreciationResponse) {
		if(appreciationResponse == null || !validAppreciationResponseLength(appreciationResponse) ||
				!validAppreciationResponseMatch(appreciationResponse)) {
			return false;
		}
		return true;
	}
	
	public static boolean validAppreciationResponseLength(String appreciationResponse) {
		if(appreciationResponse.length() < ServiceValues.APPRECIATION_RESPONSE_MIN || 
				appreciationResponse.length() > ServiceValues.APPRECIATION_RESPONSE_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validAppreciationResponseMatch(String appreciationResponse) {
		if(!appreciationResponse.matches(DomainRegex.APPRECIATION_RESPONSE)) {
			return false;
		}
		return true;
	}
	
	public static boolean validMessage(String message) {
		if(message == null || !validMessageLength(message) ||
				!validMessageMatch(message)) {
			return false;
		}
		return true;
	}
	
	public static boolean validMessageLength(String message) {
		if(message.length() < ServiceValues.MESSAGE_MIN || 
				message.length() > ServiceValues.MESSAGE_MAX) {
			return false;
		}
		return true;
	}
	
	public static boolean validMessageMatch(String message) {
		if(!message.matches(DomainRegex.MESSAGE)) {
			return false;
		}
		return true;
	}
	
	public static boolean validCurrency(String currency) {
		if(currency == null) {
			return false;
		}
		
		return currencyMap.containsValue(currency);
	}
	
	public static boolean validCost(Long cost) {
		if(cost == null || cost > ServiceValues.COST_MAX || 
				cost < ServiceValues.COST_MIN) {
			return false;
		}
		return true;
	}
	
	public static boolean validCommentCost(Long cost) {
		if(cost == null || cost > ServiceValues.COST_COMMENT_MAX ||
				cost < ServiceValues.COST_COMMENT_MIN) {
			return false;
		}
		return true;
	}
	
	public static boolean validAppreciation(Long appreciation) {
		if(appreciation == null || appreciation > ServiceValues.APPRECIATE_MAX ||
				appreciation < ServiceValues.APPRECIATE_MIN) {
			return false;
		}
		return true;
	}
	
	public static boolean validPromotion(Long promotion) {
		if(promotion == null || promotion > ServiceValues.PROMOTE_MAX ||
				promotion < ServiceValues.PROMOTE_MIN) {
			return false;
		}
		return true;
	}
	
	public static boolean validTagString(String tags) {
		if(tags == null) {
			//if(ServiceValues.TAGS_MIN == 0)
			return true;
		}
		
		List<String> tagList;
		try {
			tagList = PyUtils.getTags(tags);
		} catch(Exception e) {
			return false;
		}
		
		return validTags(tagList);
	}
	
	public static boolean validTags(List<String> tags) {
		// Check is done to ensure this is still valid if constant changed in later 
		// versions extra assignment is done to avoid compiler warning with no proper 
		// way to @SuppressWarnings
		int TAGS_MIN = ServiceValues.TAGS_MIN;
		if(tags == null && TAGS_MIN == 0) {
			return true;
		}
		if(tags == null || tags.size() > ServiceValues.TAGS_MAX ||
				tags.size() < ServiceValues.TAGS_MIN) {
			return false;
		}
		boolean valid = true;
		for(String tag : tags) {
			if(!validTag(tag)) {
				valid = false;
			}
		}
		return valid;
	}
	
	public static boolean validTag(String tag) {
		if(tag == null || tag.length() > ServiceValues.TAG_MAX || 
				tag.length() < ServiceValues.TAG_MIN || 
				!tag.matches(DomainRegex.TAG)) {
			return false;
		}
		return true;
	}
	
	public static boolean validOptions(Map<SETTING_OPTION, Boolean> options) {
		if(options == null) {
			return true;
		}
		for(Map.Entry<SETTING_OPTION, Boolean> entry : options.entrySet()) {
			if(!validOption(entry.getKey(), entry.getValue())) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validOption(SETTING_OPTION key, Boolean value) {
		if(value == null || key == null) {
			return false;
		}
		return true;
	}
	
	public static boolean validHiddenNotifications(List<EVENT_TYPE> types) {
		if(types == null) {
			return true;
		}
		if(types.size() > ServiceValues.HIDDEN_NOTIFICATIONS_MAX || 
				types.size() < ServiceValues.HIDDEN_NOTIFICATIONS_MIN) {
			return false;
		}
		for(EVENT_TYPE type : types) {
			if(!validEventType(type)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validHiddenFeed(List<EVENT_TYPE> types) {
		if(types == null) {
			return true;
		}
		if(types.size() > ServiceValues.HIDDEN_FEED_MAX || 
				types.size() < ServiceValues.HIDDEN_FEED_MIN) {
			return false;
		}
		for(EVENT_TYPE type : types) {
			if(!validEventType(type)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validEventType(EVENT_TYPE type) {
		if(type == null) {
			return false;
		}
		return true;
	}
	
	public static boolean validFilters(List<Filter> filters) {
		if(filters == null) {
			return true;
		}
		if(filters.size() > ServiceValues.FILTERS_MAX || 
				filters.size() < ServiceValues.FILTERS_MIN) {
			return false;
		}
		for(Filter f : filters) {
			if(!validFilter(f)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validFilter(Filter filter) {
		if(filter == null) {
			return false;
		}
		if(filter.sort == null) {
			return false;
		}
		if(filter.time == null) {
			return false;
		}
		if(!validTags(filter.getTags())) {
			return false;
		}
		/*
		if(!validTags(filter.getExcludeTags())) {
			return false;
		}
		if(!exclusiveLists(filter.getTags(), filter.getExcludeTags())) {
			return false;
		}
		*/
		return true;
	}
	
	public static boolean exclusiveLists(List<String> l1, List<String> l2) {
		if(l1 == null || l2 == null) {
			return true;
		}
		List<String> lower = new ArrayList<String>();
		for(String s : l1) {
			lower.add(s.toLowerCase());
		}
		for(String s : l2) {
			if(lower.contains(s.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validPendingActions(List<String> actions) {
		if(actions == null) {
			return false;
		}
		
		for(String action : actions) {
			if(!validPendingAction(action)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validRoles(List<String> roles) {
		if(roles == null) {
			return false;
		}
		
		for(String role : roles) {
			if(!validRole(role)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validPendingAction(String action) {
		if(action == null || action.isEmpty()) {
			return false;
		}
		
		return pendingActionMap.containsValue(action);
	}
	
	public static boolean validRole(String role) {
		if(role == null || role.isEmpty()) {
			return false;
		}
		
		return roleMap.containsValue(role);
	}
	
	public static boolean validOverrideRoles(List<String> roles) {
		if(roles == null) {
			return false;
		}
		
		for(String role : roles) {
			if(!validOverrideRole(role)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validOverrideRole(String role) {
		if(role == null || role.isEmpty()) {
			return false;
		}
		
		return overrideRoleMap.containsValue(role);
	}
	
	public static boolean validWord(String word) {
		if(word == null || word.isEmpty()) {
			return false;
		}
		if(!validWordLength(word)) {
			return false;
		}
		return true;
	}
	
	public static boolean validWordLength(String word) {
		if(word == null || word.length() > ServiceValues.WORD_MAX 
				|| word.length() < ServiceValues.WORD_MIN) {
			return false;
		}
		return true;
	}
	
	public static boolean validLanguage(String language) {
		if(language == null) {
			return false;
		}
		if(languageList.contains(language)) {
			return true;
		}
		return false;
	}
}
