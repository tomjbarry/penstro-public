package com.py.py.constants;

// used instead of httpstatus in case of custom defined behavior
// also identifies the total types of response codes used in this api

public class ResponseCodes {

	public static final int SUCCESS = 200;
	public static final int CREATED = 201;
	public static final int DELETED = 204;
	
	public static final int FAILURE = 400;
	public static final int DENIED = 401;
	public static final int INVALID = 420;
	public static final int NOT_ALLOWED = 424;
	public static final int LIMIT = 425;
	public static final int LOCKED = 403;
	public static final int LOGIN_LOCKED = 430;
	public static final int OBJECT_LOCKED = 423;
	public static final int EXPIRED = 419;
	public static final int THEFT = 498;
	
	public static final int EXISTS = 409;
	public static final int EXISTS_USERNAME = 481;
	public static final int EXISTS_EMAIL = 482;
	public static final int NOT_FOUND = 410;
	public static final int NOT_FOUND_BACKER = 491;
	
	public static final int ERROR = 500;
	
	public static final int BALANCE = 412;
	public static final int FINANCE = 500;
	
	public static final int PAYMENT = 500;
	public static final int PAYMENT_TARGET = 402;
	
	// indicates that there is no fault on the user, and that the same request 
	// can be made later
	public static final int EXTERNAL_SERVICE = 520;
	
	public static final int FEATURE_DISABLED = 521;
	
	public static final int PAGEABLE = 416;
	public static final int PARAMETER = 449;
	
	// restricted
	public static final int RESTRICTED = 460;
	public static final int RESTRICTED_USERNAME = 461;
	public static final int RESTRICTED_PASSWORD = 462;
	public static final int RESTRICTED_EMAIL = 463;
	public static final int THROTTLED_ADDRESS = 429;
	
}
