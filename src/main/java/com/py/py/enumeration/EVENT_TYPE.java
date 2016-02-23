package com.py.py.enumeration;

/*
 * Instead of using reflection passing by class, an enum is used, as there
 * may be more than just those objects listed under domain/subdomain. An 
 * object may be targeted that is represented solely at the service layer
 * or above.
 */

public enum EVENT_TYPE {
	ANY,
	POSTING,
	COMMENT,
	COMMENT_SUB,
	MESSAGE,
	APPRECIATION_POSTING,
	APPRECIATION_COMMENT,
	APPRECIATION_ATTEMPT,
	PROMOTION_POSTING,
	PROMOTION_COMMENT,
	OFFER,
	OFFER_ACCEPT,
	OFFER_WITHDRAW,
	OFFER_DENY,
	BACKING_CANCEL,
	BACKING_WITHDRAW,
	FOLLOW_ADD,
	FOLLOW_REMOVE,
	POSTING_INFRINGEMENT,
	COMMENT_INFRINGEMENT
}
