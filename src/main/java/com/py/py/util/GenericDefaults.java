package com.py.py.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.py.py.constants.TimeValues;
import com.py.py.enumeration.ADMIN_STATE;
import com.py.py.enumeration.ADMIN_TYPE;
import com.py.py.enumeration.COMMENT_TYPE;
import com.py.py.enumeration.EVENT_TYPE;
import com.py.py.enumeration.FEEDBACK_CONTEXT;
import com.py.py.enumeration.FEEDBACK_STATE;
import com.py.py.enumeration.FEEDBACK_TYPE;
import com.py.py.enumeration.FLAG_TYPE;
import com.py.py.enumeration.RESTRICTED_TYPE;

public class GenericDefaults {

	public static final int PAGEABLE_PAGE = 0;
	public static final int PAGEABLE_SIZE = 12;
	public static final int DIRECTION = -1;
	public static final String LANGUAGE = "en";
	public static final int TAGS_SEARCH_COUNT = 10;
	public static final String SORT = "value";
	public static final String TIME = "hour";
	public static final boolean WARNING = false;
	public static final String WARNING_CONTENT_REPLACEMENT = 
			"This content is for mature readers only.";
	public static final String WARNING_DESCRIPTION_REPLACEMENT = 
			WARNING_CONTENT_REPLACEMENT;
	public static final String WARNING_APPRECIATION_RESPONSE_REPLACEMENT = 
			WARNING_CONTENT_REPLACEMENT;
	
	// in milliseconds
	public static final long SEGMENT_HOUR = 1000L*60L*5L; // 5 minutes
	public static final long SEGMENT_DAY = TimeValues.TIME_HOUR; // hour
	public static final long SEGMENT_MONTH = TimeValues.TIME_DAY; // day
	public static final long SEGMENT_YEAR = TimeValues.TIME_MONTH; // month
	public static final long SEGMENT_ALLTIME = TimeValues.TIME_YEAR; // year
	
	// admin
	public static final FEEDBACK_TYPE FEEDBACK_FEEDBACK_TYPE = null;
	public static final FEEDBACK_STATE FEEDBACK_FEEDBACK_STATE = null;
	public static final FEEDBACK_CONTEXT FEEDBACK_FEEDBACK_CONTEXT = null;
	public static final RESTRICTED_TYPE RESTRICTED_RESTRICTED_TYPE = null;
	public static final FLAG_TYPE FLAG_DATA_TYPE = FLAG_TYPE.POSTING;
	public static final ADMIN_TYPE ADMIN_ACTION_TYPE = null;
	public static final ADMIN_STATE ADMIN_ACTION_STATE = null;

	public static final List<EVENT_TYPE> NOTIFICATION_EVENTS = 
			Collections.unmodifiableList(Arrays.asList(
						EVENT_TYPE.POSTING, 
						EVENT_TYPE.COMMENT,
						EVENT_TYPE.COMMENT_SUB,
						EVENT_TYPE.FOLLOW_ADD,
						EVENT_TYPE.FOLLOW_REMOVE,
						EVENT_TYPE.APPRECIATION_POSTING,
						EVENT_TYPE.APPRECIATION_COMMENT,
						EVENT_TYPE.APPRECIATION_ATTEMPT,
						EVENT_TYPE.PROMOTION_POSTING,
						EVENT_TYPE.PROMOTION_COMMENT,
						//EVENT_TYPE.BACKING_CANCEL,
						//EVENT_TYPE.BACKING_WITHDRAW,
						EVENT_TYPE.OFFER,
						EVENT_TYPE.OFFER_ACCEPT,
						//EVENT_TYPE.OFFER_DENY,
						//EVENT_TYPE.OFFER_WITHDRAW,
						EVENT_TYPE.POSTING_INFRINGEMENT,
						EVENT_TYPE.COMMENT_INFRINGEMENT));
	
	public static final List<EVENT_TYPE> FEED_EVENTS = 
			Collections.unmodifiableList(Arrays.asList(
						EVENT_TYPE.POSTING,
						EVENT_TYPE.COMMENT,
						EVENT_TYPE.COMMENT_SUB,
						EVENT_TYPE.FOLLOW_ADD,
						EVENT_TYPE.FOLLOW_REMOVE,
						EVENT_TYPE.APPRECIATION_POSTING,
						EVENT_TYPE.APPRECIATION_COMMENT,
						EVENT_TYPE.PROMOTION_POSTING,
						EVENT_TYPE.PROMOTION_COMMENT));
	
	public static final List<COMMENT_TYPE> COMMENT_PREVIEW_TYPES = 
			Collections.unmodifiableList(Arrays.asList(
						COMMENT_TYPE.USER,
						COMMENT_TYPE.POSTING,
						COMMENT_TYPE.TAG));
}
