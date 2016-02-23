package com.py.py.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ServiceValues {
	// authentication
	public static final int USER_LOGIN_ATTEMPTS_NONE = 0;
	public static final int USER_LOGIN_ATTEMPTS_MAX = 5;
	public static final int LOCATIONS_MAX = 5;
	public static final int MAX_CONCURRENT_LOGINS = 5;
//	public static final int MAX_LOGIN_COUNT = 15;
	// login fails for each saved location + 1 for non saved locations, + the last successful logins
	public static final int MAX_LOGIN_COUNT = USER_LOGIN_ATTEMPTS_MAX * (LOCATIONS_MAX + 1) + MAX_CONCURRENT_LOGINS;
	// limits the password attempts on verifying password while logged in
	public static final int PASSWORD_ATTEMPT_COUNT = 5;
	public static final long PASSWORD_ATTEMPT_THROTTLE_THRESHOLD = 15L * 1000L * 60L;
	
	// milliseconds
	public static final long LOGIN_ATTEMPT_TIME_THRESHOLD = 15L * 1000L * 60L;
	
	// message
	public static final int MESSAGE_PREVIEW_LENGTH = 140;
	
	// in milliseconds
	// how often it should wait before updating the action to avoid writing on every request
	public static final long AUTHENTICATION_LAST_ACTION_UPDATE_THRESHOLD = 5L * 60L * 1000L;
	//public static final long AUTHENTICATION_LAST_ACTION_EXPIRY = 60 * 60 * 1000
	//		+ AUTHENTICATION_LAST_ACTION_UPDATE_THRESHOLD;
	public static final long AUTHENTICATION_INACTIVITY_DEFAULT = TimeValues.TIME_HOUR + AUTHENTICATION_LAST_ACTION_UPDATE_THRESHOLD;
	public static final long AUTHENTICATION_INACTIVITY_REMEMBER_ME = TimeValues.TIME_DAY * 7L + AUTHENTICATION_LAST_ACTION_UPDATE_THRESHOLD;
	
	// pageable
	public static final int PAGEABLE_SIZE_MAX = 50;
	
	// escrow
	public static final int ESCROW_OFFER_REFUND_BATCH_SIZE = 100;
	public static final long ESCROW_OFFER_EXPIRY = TimeValues.TIME_MONTH;

	// user
	public static final int USERNAME_MIN = 3;
	public static final int USERNAME_MAX = 24;
	public static final int PASSWORD_MIN = 9;
	public static final int PASSWORD_MAX = 1024;
	public static final int EMAIL_MIN = 3;
	public static final int EMAIL_MAX = 254;
	public static final int PAYMENT_ID_MIN = EMAIL_MIN;
	public static final int PAYMENT_ID_MAX = EMAIL_MAX;
	public static final int DESCRIPTION_MIN = 0;
	public static final int DESCRIPTION_MAX = 20000;
	
	// userInfo
	public static final int APPRECIATION_TARGET_MAX = 5;
	public static final long APPRECIATION_TARGET_EXPIRY = TimeValues.TIME_HOUR;
	
	// register
	public static final int RECAPTCHA_RESPONSE_MIN = 1;
	
	// posting
	public static final int TITLE_MIN = 5;
	public static final int TITLE_MAX = 140;
	public static final int CONTENT_MIN = 10;
	public static final int CONTENT_MAX = 40000;
	public static final int EDIT_MIN = 0;
	public static final int EDIT_MAX = 10000;
	public static final int PREVIEW_MIN = 0;
	public static final int PREVIEW_MAX = 300;
	public static final int APPRECIATION_RESPONSE_MIN = 0;
	public static final int APPRECIATION_RESPONSE_MAX = 10000;
	// cents
	// now allowing it to be free
	public static final long COST_MIN = 0;
	// one million? quite excessive!
	public static final long COST_MAX = 10000;
	public static final long POSTING_INACTIVE = TimeValues.TIME_YEAR;
	public static final long POSTING_WEIGHT = 5;
	// image reference
	// this is the maximum length of a url in IE. Seems fitting to use it as our max!
	public static final int IMAGE_LINK_MAX = 2083;
	public static final int IMAGE_WIDTH_MIN = 200;
	public static final int IMAGE_WIDTH_MAX = 1600;
	public static final int IMAGE_HEIGHT_MIN = 200;
	public static final int IMAGE_HEIGHT_MAX = 1600;
	
	// posting tags
	public static final int POSTING_TAG_SORT_MAX_BATCHES = 1000;
	public static final int POSTING_TAG_SORT_BATCH_SIZE = 500;
	public static final int POSTING_TAGS_TOTAL_MAX = 50;
	public static final int POSTING_TAGS_TOTAL = 5;
	
	public static final int TAGS_ADD_MAX = POSTING_TAGS_TOTAL;
	public static final int TAGS_DISPLAY_PREVIEW = POSTING_TAGS_TOTAL;
	public static final int TAGS_DISPLAY = POSTING_TAGS_TOTAL;
	
	// this is the default time to check
	// we can probably assume it will always be redeployed within a day
	public static final long SORT_POSTING_TAGS_DEFAULT_TIME_SINCE = TimeValues.TIME_DAY;
	
	// appreciate
	public static final double APPRECIATE_MIN = 1.0d;
	public static final double APPRECIATE_MAX = 100.0d;
	public static final long APPRECIATE_WEIGHT = 5;
	
	// purchase currency (in currency)
	public static final long PURCHASE_CURRENCY_MIN = 100;
	public static final long PURCHASE_CURRENCY_MAX = 10000;
	
	// promote
	public static final long PROMOTE_MIN = 1;
	public static final long PROMOTE_MAX = 10000;
	public static final long PROMOTE_WEIGHT = 5;
	
	// comment
	// now allowing it to be free
	public static final long COST_COMMENT_MIN = 0;
	public static final long COST_COMMENT_MAX = 10000;
	public static final int COMMENT_CONTENT_MIN = 1;
	public static final int COMMENT_CONTENT_MAX = 10000;
	//public static final int COMMENT_PREVIEW_LENGTH = 140;
	public static final long COMMENT_INACTIVE = TimeValues.TIME_YEAR;
	public static final long COMMENT_WEIGHT = 2;
	
	// message
	public static final int MESSAGE_MIN = 1;
	public static final int MESSAGE_MAX = 512;
	
	// correspondence
	public static final long CORRESPONDENCE_EXPIRY = TimeValues.TIME_YEAR;
	
	// tag
	// in tags
	public static final int TAGS_MAX = ServiceValues.TAGS_ADD_MAX;
	public static final int TAGS_MIN = 0;
	// in chars
	public static final int TAG_MIN = 1;
	public static final int TAG_MAX = 24;
	
	// backing
	public static final int BACKING_TOTAL_USERS = 10;
	public static final int BACKING_COST_MIN = 1;
	public static final int BACKING_COST_MAX = 10000;
	
	// followees
	public static final int MAX_FOLLOWEES = 20;
	
	// blocked
	public static final int MAX_BLOCKED = 20;
	
	// grace period for aggregations
	public static final long EXPIRY_GRACE_PERIOD_HOUR = TimeValues.TIME_DAY;
	public static final long EXPIRY_GRACE_PERIOD_DAY = TimeValues.TIME_MONTH;
	public static final long EXPIRY_GRACE_PERIOD_MONTH = TimeValues.TIME_MONTH;
	public static final long EXPIRY_GRACE_PERIOD_YEAR = TimeValues.TIME_YEAR;
	
	// settings
	public static final int HIDDEN_NOTIFICATIONS_MAX = 25;
	public static final int HIDDEN_NOTIFICATIONS_MIN = 0;
	public static final int HIDDEN_FEED_MAX = 25;
	public static final int HIDDEN_FEED_MIN = 0;
	public static final int FILTERS_MAX = 10;
	public static final int FILTERS_MIN = 0;
	
	// email token
	public static final long EMAIL_TOKEN_EXPIRATION = TimeValues.TIME_DAY;
	public static final long MAX_EMAIL_TOKENS = 5;
	
	// votes
	public static final int MAX_VOTES = 1000;
	// ratio of flag value vs appreciation
	public static final double FLAG_VALUE_THRESHOLD = 2;
	public static final long FLAG_DENOMINATOR_MAX = 1000;
	public static final int FLAG_COUNT_THRESHOLD_MIN = 5;
	public static final int FLAG_COUNT_THRESHOLD_MAX = MAX_VOTES - 1;
	public static final int FLAG_USER_COUNT_THRESHOLD_MIN = 5;
	public static final double FLAG_USER_VALUE_THRESHOLD = 3;
	public static final int FLAG_USER_COUNT_THRESHOLD_MAX = MAX_VOTES - 1;
	public static final int FLAG_USER_MAX_MONTHS = 6;
	public static final long USER_WEIGHT_MAX = 100;
	public static final long USER_WEIGHT_MIN = 1;
	public static final long USER_WEIGHT_NORMALIZATION = 5;
	// warn
	public static final double WARN_VALUE_THRESHOLD = .3;
	public static final long WARN_APPRECIATION_MIN = 10;
	public static final long WARN_VALUE_MIN = 10;
	
	// feedback
	public static final int SUMMARY_MAX = 2048;
	public static final int SUMMARY_MIN = 10;

	// restricted
	public static final int WORD_MAX = EMAIL_MAX;
	public static final int WORD_MIN = 1;
	public static final int RESTRICTED_BATCH_SIZE = 500;
	
	// finance
	public static final long AMOUNT_MAX = 1000000;
	public static final long AMOUNT_MIN = 1;
	public static final long DEAL_EXPIRATION_PERIOD = TimeValues.TIME_DAY * 30;
	public static final int DEAL_BATCH_SIZE = 100;
	public static final double CURRENCY_CONVERSION = 100.0d;
	
	// tax rates
	public static final double TAX_RATE_CITY = .0165;
	public static final double TAX_RATE_STATE_COUNTY = .063;
	public static final double TAX_RATE_TOTAL = TAX_RATE_CITY + TAX_RATE_STATE_COUNTY;
	
	// payment
	public static final double PAYMENT_APPRECIATION_FEE = 0.1d;
	public static final int PAYMENT_DOUBLE_PRECISION = 2;
	public static final int PAYMENT_NO_PRECISION = 0;
	public static final int PAYMENT_BATCH_SIZE = 100;
	public static final int PAYKEY_DURATION_HOURS = 3;
	public static final long PAYMENT_MARK_TIME = TimeValues.TIME_HOUR * PAYKEY_DURATION_HOURS;
	
	/*public static final long PAYMENT_EXPIRATION_PERIOD = 
			(ServiceValues.PAYKEY_DURATION_HOURS * TimeValues.TIME_HOUR) 
			+ TimeValues.TIME_HOUR;
	*/
	public static final long PAYMENT_EXPIRATION_PERIOD = TimeValues.TIME_MONTH;
	public static final long PAYMENT_EXPIRATION_REMOVAL_PERIOD = TimeValues.TIME_MONTH * 3L;
	public static final long PAYMENT_PROCESSING_TIME = TimeValues.TIME_HOUR / 12L;
	public static final long PAYMENT_CHECK_ALL_TIME = TimeValues.TIME_HOUR / 12L;
	
	// admin
	public static final long ADMIN_ACTION_EXPIRATION_PERIOD = TimeValues.TIME_HOUR * 3;
	public static final int ADMIN_ACTION_BATCH_SIZE = 100;
	
	// user delete
	// time between user selecting delete and actual deletion
	public static final long USER_DELETED_EXPIRATION_PERIOD = TimeValues.TIME_MONTH * 3;
	// time between deleting and running another delete to ensure cacheing did not cause issues
	public static final long USER_DELETED_COMPLETION_PERIOD = TimeValues.TIME_DAY;
	public static final int USER_DELETED_BATCH_SIZE = 1000;
	
	// user rename
	public static final int USER_RENAME_BATCH_SIZE = 1000;
	public static final long USER_RENAME_COMPLETION_PERIOD = TimeValues.TIME_HOUR;
	
	// flag data
	public static final long FLAG_DATA_MINIMUM = 0l;
	public static final long FLAG_DATA_DECREMENT = 5l;
	
	public static final List<String> DEFAULT_PENDING_ACTIONS = Collections.unmodifiableList(Arrays.asList(
			PendingActions.UNCONFIRMED_EMAIL,
			PendingActions.UNLINKED_PAYMENT_ID));
	
}
