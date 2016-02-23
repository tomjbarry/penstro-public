package com.py.py.constants;

public class APIUrls {
	
	// Unused Constants
	protected static final String APPRECIATE = "/appreciate";
	protected static final String PROMOTE = "/promote";
	protected static final String ACCEPT = "/accept";
	protected static final String DENY = "/deny";
	protected static final String WITHDRAW = "/withdraw";
	protected static final String OUTSTANDING = "/outstanding";
	protected static final String EMAIL = "/email";
	protected static final String AUTHOR = "/author";
	protected static final String BENEFICIARY = "/beneficiary";
	protected static final String ENABLE = "/enable";
	protected static final String DISABLE = "/disable";
	protected static final String SEND = "/send";
	protected static final String FLAG = "/flag";
	protected static final String CHANGE = "/change";
	protected static final String RESET = "/reset";
	protected static final String REMOVE = "/remove";
	protected static final String DELETE = "/delete";
	protected static final String ROLES = "/roles";
	protected static final String PENDING_ACTIONS = "/pending";
	protected static final String PURCHASE = "/purchase";
	protected static final String RESPONSE = "/response";
	protected static final String SUCCESS = "/success";
	protected static final String SHOW = "/show";
	protected static final String SAVE = "/save";
	
	protected static final String USER_PATH_VARIABLE = "/{" + PathVariables.USER_ID + "}";
	protected static final String EMAIL_PATH_VARIABLE = "/{" + PathVariables.EMAIL_ID + ":.+}";
	protected static final String POSTING_PATH_VARIABLE = "/{" + PathVariables.POSTING_ID + "}";
	protected static final String COMMENT_PATH_VARIABLE = "/{" + PathVariables.COMMENT_ID + "}";
	protected static final String TAG_PATH_VARIABLE = "/{" + PathVariables.TAG_ID + "}";
	
	// General
	public static final String INDEX = "/";
	public static final String INVALID = "/invalid";
	public static final String FAILURE = "/failure";
	
	// Statistics
	public static final String STATS = "/stats";
	public static final String STATS_TOTALS = STATS + "/totals";
	
	// Authentication
	public static final String LOGOUT = "/logout";
	public static final String LOGOUT_SUCCESS = "/logout/success";
	public static final String LOGOUT_FAILURE = "/logout/failure";
	public static final String LOGIN = "/login";
	public static final String LOGIN_SUCCESS = "/login/success";
	public static final String LOGIN_LOCKED = "/loginLocked";
	public static final String LOCKED = "/locked";
	public static final String DENIED = "/denied";
	public static final String EXPIRED = "/expired";
	public static final String THEFT = "/theft";
	public static final String REGISTER = "/register";

	// Feed
	public static final String FEED = "/feed";
	
	// Payment
	public static final String PAYMENT = "/payment";
	public static final String PAYMENT_NOTIFICATION = PAYMENT + "/notification";
	public static final String CURRENCY_PURCHASE = "/currency" + PURCHASE;
	
	// Users
	public static final String USERS = "/users";
	public static final String USERS_ID = USERS + USER_PATH_VARIABLE;
	public static final String USERS_ACTIVITY = USERS_ID + FEED;
	public static final String USERS_CURRENT = "/current";
	public static final String USERS_ROLES = ROLES;
	public static final String PROFILE = "/profile";
	public static final String APPRECIATION_RESPONSE = RESPONSE;
	public static final String USERS_ID_APPRECIATION_RESPONSE = USERS_ID + RESPONSE;
	public static final String USERS_ACCEPT = USERS_CURRENT + ACCEPT;
	public static final String CONFIRMATION = "/confirmation";
	public static final String CONFIRMATION_SEND = CONFIRMATION + SEND;
	public static final String PAYMENT_CHANGE = PAYMENT + CHANGE;
	public static final String PAYMENT_CHANGE_REQUEST = PAYMENT + SEND;
	public static final String EMAIL_CHANGE = EMAIL + CHANGE;
	public static final String EMAIL_PENDING_ACTION_CHANGE = EMAIL + PENDING_ACTIONS;
	public static final String EMAIL_CHANGE_REQUEST = EMAIL;
	public static final String PASSWORD_CHANGE = "/password";
	public static final String PASSWORD_UNAUTHED_CHANGE = PASSWORD_CHANGE + USERS + 
			USER_PATH_VARIABLE;
	public static final String PASSWORD_RESET = PASSWORD_CHANGE + RESET;
	public static final String USERS_DELETE = USERS_CURRENT + DELETE;
	public static final String USERS_DELETE_SEND = USERS_CURRENT + DELETE + SEND;
	public static final String USERS_ID_FLAG = USERS_ID + FLAG;
	public static final String LOCATIONS = "/locations";
	public static final String LOCATIONS_REMOVE = LOCATIONS + REMOVE;
	
	// Finances
	public static final String FINANCES = "/finances";
	
	
	// Notifications
	public static final String NOTIFICATIONS = "/notifications";
	
	// Messages
	public static final String MESSAGES = "/messages";
	public static final String MESSAGES_CONVERSATION = MESSAGES + USERS + 
			USER_PATH_VARIABLE;
	public static final String MESSAGES_CONVERSATION_MESSAGES = MESSAGES + USERS + 
			USER_PATH_VARIABLE + MESSAGES;
	public static final String MESSAGES_CONVERSATION_FLAG = MESSAGES_CONVERSATION + FLAG;
	public static final String MESSAGES_CONVERSATION_SHOW = MESSAGES_CONVERSATION + SHOW;
	public static final String MESSAGES_CONVERSATION_SAVE = MESSAGES_CONVERSATION + SAVE;
	
	// Postings
	public static final String POSTINGS = "/postings";
	public static final String POSTINGS_SELF = USERS_CURRENT + POSTINGS;
	public static final String POSTINGS_ID = POSTINGS + POSTING_PATH_VARIABLE;
	public static final String POSTINGS_APPRECIATE = POSTINGS_ID + APPRECIATE;
	public static final String POSTINGS_PROMOTE = POSTINGS_ID + PROMOTE;
	public static final String POSTINGS_AUTHOR = USERS_ID + POSTINGS + AUTHOR;
	public static final String POSTINGS_BENEFICIARY = USERS_ID + POSTINGS + BENEFICIARY;
	public static final String POSTINGS_ID_ENABLE = POSTINGS_ID + ENABLE;
	public static final String POSTINGS_ID_DISABLE = POSTINGS_ID + DISABLE;
	public static final String POSTINGS_ID_FLAG = POSTINGS_ID + FLAG;
	public static final String POSTINGS_ID_EDIT = POSTINGS_ID + CHANGE;

	// Tags
	public static final String TAGS = "/tags";
	public static final String TAGS_ID = TAGS + TAG_PATH_VARIABLE;
	
	// Comments
	public static final String COMMENTS = "/comments";
	public static final String COMMENTS_SELF = USERS_CURRENT + COMMENTS;
	public static final String POSTINGS_COMMENTS = POSTINGS_ID + COMMENTS;
	public static final String USERS_COMMENTS = USERS_ID + COMMENTS;
	public static final String TAGS_COMMENTS = TAGS_ID + COMMENTS;
	public static final String COMMENTS_ID = COMMENTS + COMMENT_PATH_VARIABLE;
	public static final String COMMENTS_COMMENTS = COMMENTS_ID + COMMENTS;
	public static final String COMMENTS_APPRECIATE = COMMENTS_ID + APPRECIATE;
	public static final String COMMENTS_PROMOTE = COMMENTS_ID + PROMOTE;
	public static final String COMMENTS_AUTHOR = USERS_ID + COMMENTS + AUTHOR;
	public static final String COMMENTS_BENEFICIARY = USERS_ID + COMMENTS + BENEFICIARY;
	public static final String COMMENTS_ID_ENABLE = COMMENTS_ID + ENABLE;
	public static final String COMMENTS_ID_DISABLE = COMMENTS_ID + DISABLE;
	public static final String COMMENTS_ID_FLAG = COMMENTS_ID + FLAG;
	public static final String COMMENTS_ID_EDIT = COMMENTS_ID + CHANGE;
	
	// Backing
	public static final String BACKINGS = "/backings";
	public static final String BACKINGS_OUTSTANDING = BACKINGS + OUTSTANDING;
	public static final String BACKINGS_OUTSTANDING_ID = BACKINGS_OUTSTANDING + USERS + USER_PATH_VARIABLE;
	public static final String BACKINGS_ID = BACKINGS + USERS + USER_PATH_VARIABLE;
	
	// Offers
	public static final String OFFERS = "/offers";
	public static final String OFFERS_OUTSTANDING = OFFERS + OUTSTANDING;
	public static final String OFFERS_OUTSTANDING_ID = 
			OFFERS_OUTSTANDING + USERS + USER_PATH_VARIABLE;
	public static final String OFFERS_ID = OFFERS + USERS + USER_PATH_VARIABLE;
	public static final String OFFERS_ACCEPT = OFFERS_ID + ACCEPT;
	public static final String OFFERS_DENY = OFFERS_ID + DENY;
	public static final String OFFERS_WITHDRAW = OFFERS_OUTSTANDING_ID + WITHDRAW;
	
	// Offers Email
	public static final String OFFERS_EMAIL = OFFERS + EMAIL;
	public static final String OFFERS_OUTSTANDING_EMAIL = OFFERS_OUTSTANDING + EMAIL;
	public static final String OFFERS_EMAIL_ID = 
			OFFERS_EMAIL + EMAIL_PATH_VARIABLE + OFFERS;
	public static final String OFFERS_OUTSTANDING_EMAIL_ID = 
			OFFERS_OUTSTANDING_EMAIL + EMAIL_PATH_VARIABLE + OFFERS;
	public static final String OFFERS_EMAIL_ACCEPT = OFFERS_ID + EMAIL + ACCEPT;
	public static final String OFFERS_EMAIL_DENY = OFFERS_ID + EMAIL + DENY;
	public static final String OFFERS_EMAIL_WITHDRAW = OFFERS_OUTSTANDING_EMAIL_ID + WITHDRAW;
	
	// Subscription
	public static final String SUBSCRIPTION = "/subscription";
	
	// Follow
	public static final String FOLLOWEES = "/followees";
	public static final String FOLLOWEES_ID = FOLLOWEES + USERS + USER_PATH_VARIABLE;
	public static final String FOLLOWERS = "/followers";
	public static final String FOLLOWERS_ID = FOLLOWERS + USERS + USER_PATH_VARIABLE;
	public static final String USER_FOLLOWEES = USERS_ID + FOLLOWEES;
	public static final String USER_FOLLOWERS = USERS_ID + FOLLOWERS;
	
	// Block
	public static final String BLOCKED = "/blocked";
	public static final String BLOCKED_ID = BLOCKED + USERS + USER_PATH_VARIABLE;
	
	
	// Settings
	public static final String SETTINGS = "/settings";
	
	// Feedback
	public static final String FEEDBACKS = "/feedbacks";
	
}
