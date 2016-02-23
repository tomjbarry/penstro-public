package com.py.py.constants;

public class DomainRegex {

	public static final String ESCROW_ID_DELIMITER = ":";
	public static final String ESCROW_ID_DELIMITER_STRING = ":";
	
	public static final String USERNAME = "^[A-Za-z0-9_]+";
	//public static final String PASSWORD = "^[A-Za-z0-9]+";
	//public static final String EMAIL = "^[\\S]+@[\\S]+[.][\\S]+";
	public static final String EMAIL = "^[a-zA-Z0-9+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	public static final String PAYMENT_ID = EMAIL;
	
	public static final String DESCRIPTION = "^[\\s\\S]*";
	public static final String APPRECIATION_RESPONSE = "^[\\s\\S]*";
	public static final String TITLE = "^[\\s\\S]*";
	public static final String CONTENT = "^[\\s\\S]*";
	public static final String EDIT = "^[\\s\\S]*";
	public static final String PREVIEW = "^[\\s\\S]*";
	public static final String MESSAGE = "^[\\s\\S]*";
	public static final String IMAGE_LINK = "^https?:\\/\\/[\\-a-zA-Z0-9+&@#\\/%?=~_|!:,.;]*[\\-a-zA-Z0-9+&@#\\/%=~_|]";
	
	public static final String LANGUAGE = "[\\s\\S]*";
	
	public static final String TAG = "[A-Za-z0-9_]+";
	public static final String TAG_DELIMITER = "[ \\s]+";
	public static final String TAG_DELIMITER_STRING = " ";
	public static final String TAG_ID_DELIMITER = ":";
	public static final String TAG_ID_DELIMITER_STRING = ":";
	public static final String TAG_ID = TAG + TAG_ID_DELIMITER + LANGUAGE;
	public static final String TAGS = "^(" + TAG + TAG_DELIMITER + "*)+";
	
	public static final String TOKEN_DELIMITER = ":";
	public static final String TOKEN_DELIMITER_STRING = ":";

}
