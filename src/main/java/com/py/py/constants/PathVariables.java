package com.py.py.constants;

/*
 * This class has 2 main uses -
 * 1) To be used as path variable keys for urls
 * 2) To be used as keys for notification references that will 
 * map directly to path variables
 * In both cases, optimal string values should be as short as possible
 */

public class PathVariables {

	// used in urls
	public static final String POSTING_ID = "pid";
	public static final String COMMENT_ID = "cid";
	public static final String USER_ID = "uid";
	public static final String EMAIL_ID = "eid";
	public static final String TAG_ID = "tag";
	
	// only used to differentiate between objects in events
	public static final String PARENT_ID = "parid";
	public static final String TARGET_ID = "tid";
	public static final String SOURCE_ID = "sid";
	public static final String BENEFICIARY_ID = "bid";
	
	// used in admin urls
	public static final String FEEDBACK_ID = "fid";
	public static final String ADMIN_TARGET_ID = "atid";
	public static final String RESTRICTED_ID = "rid";
	
	// used for errors
	public static final String ERROR_ID = "errorid";
}
