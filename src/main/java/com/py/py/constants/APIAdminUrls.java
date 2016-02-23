package com.py.py.constants;

public class APIAdminUrls extends APIUrls {
	
	protected static final String ADD = "/add";
	protected static final String REMOVE = "/remove";
	protected static final String CHANGE = "/change";
	protected static final String LOCK = "/lock";
	protected static final String UNLOCK = "/unlock";
	protected static final String FLAG = "/flag";
	protected static final String WARNING = "/warning";
	protected static final String TARGET = "/target";
	protected static final String TALLY_CHANGE = "/tally" + CHANGE;
	protected static final String RESTRICTED = "/restricted";
	protected static final String FLAG_DATA = "/flag";
	protected static final String ACTIONS = "/actions";
	protected static final String RENAME = "/rename";
	protected static final String CACHE = "/cache";
	
	protected static final String ADMIN = "/admin";
	
	protected static final String ADMIN_TARGET_ID = TARGET + "/{" + PathVariables.ADMIN_TARGET_ID + "}";
	
	protected static final String ADMIN_USER = 
			ADMIN + USERS + "/{" + PathVariables.USER_ID + "}";
	protected static final String ADMIN_TARGET = 
			ADMIN + ADMIN_TARGET_ID;
	protected static final String ADMIN_POSTING = 
			ADMIN + POSTINGS + "/{" + PathVariables.POSTING_ID + "}";
	protected static final String ADMIN_COMMENT = 
			ADMIN + COMMENTS + "/{" + PathVariables.COMMENT_ID + "}";
	protected static final String ADMIN_TAG = 
			ADMIN + TAGS + "/{" + PathVariables.TAG_ID + "}";

	protected static final String FEEDBACK_PATH_VARIABLE = 
			"/{" + PathVariables.FEEDBACK_ID + "}";
	protected static final String RESTRICTED_PATH_VARIABLE = 
			"/{" + PathVariables.RESTRICTED_ID + ":.*}";
	
	// Admin Check
	public static final String ADMIN_CHECK = ADMIN;
	
	// Authentication
	public static final String ADMIN_LOGOUT_USER = ADMIN_TARGET + LOGOUT;
	
	// Statistics
	public static final String ADMIN_STATISTICS_CACHE = ADMIN + STATS + CACHE;
	
	// Users
	public static final String ADMIN_EMAIL_CHANGE = ADMIN_USER + EMAIL_CHANGE;
	public static final String ADMIN_EMAIL_CHANGE_REQUEST = 
			ADMIN_TARGET + EMAIL_CHANGE_REQUEST;
	public static final String ADMIN_PAYMENT_CHANGE_REQUEST = 
			ADMIN_TARGET + PAYMENT_CHANGE_REQUEST;
	public static final String ADMIN_CONFIRMATION = ADMIN_TARGET + CONFIRMATION;
	public static final String ADMIN_PASSWORD_RESET = ADMIN_TARGET + PASSWORD_RESET;
	public static final String ADMIN_USERS_CURRENT = ADMIN_TARGET + USERS_CURRENT;
	public static final String ADMIN_USERS_UNLOCK = ADMIN_USER + UNLOCK;
	public static final String ADMIN_USERS_LOCK = ADMIN_USER + LOCK;
	public static final String ADMIN_USERS_DELETE = ADMIN_TARGET + USERS_DELETE;
	public static final String ADMIN_USERS_PROFILE = ADMIN_TARGET + PROFILE;
	public static final String ADMIN_USERS_APPRECIATION_RESPONSE = 
			ADMIN_TARGET + APPRECIATION_RESPONSE;
	public static final String ADMIN_USERS_ROLES = ADMIN_USER + ROLES;
	public static final String ADMIN_ROLES = ADMIN_TARGET + ROLES;
	public static final String ADMIN_USERS_PENDING_ACTIONS = ADMIN_TARGET + PENDING_ACTIONS;
	public static final String ADMIN_USERS_LOGIN_ATTEMPTS = ADMIN_USER + "/loginAttempts";
	public static final String ADMIN_USERS_RENAME = ADMIN_USER + RENAME;
	public static final String ADMIN_USERS_PASSWORD = ADMIN_USER + "/password";
	
	// Finance
	public static final String ADMIN_FINANCES = ADMIN_TARGET + FINANCES;
	public static final String ADMIN_FINANCES_ADD = ADMIN_USER + FINANCES + ADD;
	public static final String ADMIN_FINANCES_REMOVE = ADMIN_USER + FINANCES + REMOVE;
	
	// Payment
	public static final String ADMIN_PAYMENT = ADMIN_TARGET + PAYMENT;
	
	// Notifications
	public static final String ADMIN_NOTIFICATIONS = ADMIN_TARGET + NOTIFICATIONS;
	
	// Feed
	public static final String ADMIN_FEED = ADMIN_TARGET + FEED;
	
	// Postings
	public static final String ADMIN_POSTINGS_SELF = ADMIN_USERS_CURRENT + POSTINGS;
	public static final String ADMIN_POSTINGS_ID = ADMIN_POSTING;
	public static final String ADMIN_POSTINGS_ID_REMOVE = ADMIN_POSTING + REMOVE;
	public static final String ADMIN_POSTINGS_ID_FLAG = ADMIN_POSTING + FLAG;
	public static final String ADMIN_POSTINGS_ID_WARNING = ADMIN_POSTING + WARNING;
	public static final String ADMIN_POSTINGS_ID_ENABLE = 
			ADMIN_TARGET + POSTINGS_ID_ENABLE;
	public static final String ADMIN_POSTINGS_ID_DISABLE = 
			ADMIN_TARGET + POSTINGS_ID_DISABLE;
	public static final String ADMIN_POSTINGS_ID_TALLY_CHANGE = 
			ADMIN_POSTING + TALLY_CHANGE;
	public static final String ADMIN_POSTINGS_ID_APPRECIATE = ADMIN_POSTING + ADMIN_TARGET_ID + APPRECIATE;
	
	// Comments
	public static final String ADMIN_COMMENTS_SELF = ADMIN_USERS_CURRENT + COMMENTS;
	public static final String ADMIN_COMMENTS_ID = ADMIN_COMMENT;
	public static final String ADMIN_COMMENTS_ID_REMOVE = ADMIN_COMMENT + REMOVE;
	public static final String ADMIN_COMMENTS_ID_FLAG = ADMIN_COMMENT + FLAG;
	public static final String ADMIN_COMMENTS_ID_WARNING = ADMIN_COMMENT + WARNING;
	public static final String ADMIN_COMMENTS_ID_ENABLE = 
			ADMIN_TARGET + COMMENTS_ID_ENABLE;
	public static final String ADMIN_COMMENTS_ID_DISABLE = 
			ADMIN_TARGET + COMMENTS_ID_DISABLE;
	public static final String ADMIN_COMMENTS_ID_TALLY_CHANGE = 
			ADMIN_COMMENT + TALLY_CHANGE;
	public static final String ADMIN_COMMENTS_ID_APPRECIATE = ADMIN_COMMENT + ADMIN_TARGET_ID + APPRECIATE;
	
	// Tags
	public static final String ADMIN_TAGS_ID_LOCK = ADMIN_TAG + LOCK;
	public static final String ADMIN_TAGS_ID_UNLOCK = ADMIN_TAG + UNLOCK;
	
	// Subscription
	public static final String ADMIN_SUBSCRIPTION = ADMIN_TARGET + SUBSCRIPTION;
	
	// Following
	public static final String ADMIN_FOLLOWEES = ADMIN_TARGET + FOLLOWEES;
	public static final String ADMIN_FOLLOWERS = ADMIN_TARGET + FOLLOWERS;
	public static final String ADMIN_FOLLOWEES_ID = ADMIN_TARGET + FOLLOWEES_ID;
	public static final String ADMIN_FOLLOWERS_ID = ADMIN_TARGET + FOLLOWERS_ID;
	
	// Blocking
	public static final String ADMIN_BLOCKED = ADMIN_TARGET + BLOCKED;
	public static final String ADMIN_BLOCKED_ID = ADMIN_TARGET + BLOCKED_ID;
	
	
	// Backing
	public static final String ADMIN_BACKINGS = 
			ADMIN_TARGET + BACKINGS;
	public static final String ADMIN_BACKINGS_ID = 
			ADMIN_TARGET + BACKINGS_ID;
	public static final String ADMIN_BACKINGS_OUTSTANDING = 
			ADMIN_TARGET + BACKINGS_OUTSTANDING;
	public static final String ADMIN_BACKINGS_OUTSTANDING_ID = 
			ADMIN_TARGET + BACKINGS_OUTSTANDING_ID;
	
	// Offer
	public static final String ADMIN_OFFERS = ADMIN_TARGET + OFFERS;
	public static final String ADMIN_OFFERS_ID = ADMIN_TARGET + OFFERS_ID;
	public static final String ADMIN_OFFERS_OUTSTANDING = ADMIN_TARGET + OFFERS_OUTSTANDING;
	public static final String ADMIN_OFFERS_OUTSTANDING_ID = 
			ADMIN_TARGET + OFFERS_OUTSTANDING_ID;
	public static final String ADMIN_OFFERS_OUTSTANDING_EMAIL = 
			ADMIN_TARGET + OFFERS_OUTSTANDING_EMAIL;
	public static final String ADMIN_OFFERS_OUTSTANDING_EMAIL_ID = 
			ADMIN_TARGET + OFFERS_OUTSTANDING_EMAIL_ID;
	public static final String ADMIN_OFFERS_EMAIL_WITHDRAW = 
			ADMIN_TARGET + OFFERS_EMAIL_WITHDRAW;
	public static final String ADMIN_OFFERS_WITHDRAW = 
			ADMIN_TARGET + OFFERS_WITHDRAW;
	
	// Settings
	public static final String ADMIN_SETTINGS = ADMIN_TARGET + SETTINGS;
	
	// Feedback
	public static final String ADMIN_FEEDBACKS = ADMIN + FEEDBACKS;
	public static final String ADMIN_FEEDBACKS_CHANGE = ADMIN_FEEDBACKS + CHANGE;
	public static final String ADMIN_FEEDBACKS_ID = ADMIN_FEEDBACKS + FEEDBACK_PATH_VARIABLE;
	
	// Restricted
	public static final String ADMIN_RESTRICTEDS = ADMIN + RESTRICTED;
	public static final String ADMIN_RESTRICTEDS_ID = 
			ADMIN_RESTRICTEDS + RESTRICTED_PATH_VARIABLE;
	
	// Flag
	public static final String ADMIN_FLAG_DATA_POSTINGS = ADMIN + FLAG_DATA + POSTINGS;
	public static final String ADMIN_FLAG_DATA_COMMENTS = ADMIN + FLAG_DATA + COMMENTS;
	public static final String ADMIN_FLAG_DATA_USERS = ADMIN + FLAG_DATA + USERS;
	public static final String ADMIN_FLAG_DATA_POSTINGS_ID = ADMIN + FLAG_DATA + POSTINGS_ID;
	public static final String ADMIN_FLAG_DATA_COMMENTS_ID = ADMIN + FLAG_DATA + COMMENTS_ID;
	public static final String ADMIN_FLAG_DATA_USERS_ID = ADMIN + FLAG_DATA + USERS_ID;
	
	// Action
	public static final String ADMIN_ACTIONS = ADMIN + ACTIONS;
}
