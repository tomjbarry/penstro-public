package com.py.py.util;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.py.py.constants.DomainRegex;
import com.py.py.constants.ParamValues;
import com.py.py.constants.ServiceValues;
import com.py.py.constants.TimeValues;
import com.py.py.enumeration.ADMIN_STATE;
import com.py.py.enumeration.ADMIN_TYPE;
import com.py.py.enumeration.FEEDBACK_CONTEXT;
import com.py.py.enumeration.FEEDBACK_STATE;
import com.py.py.enumeration.FEEDBACK_TYPE;
import com.py.py.enumeration.FLAG_REASON;
import com.py.py.enumeration.FLAG_TYPE;
import com.py.py.enumeration.RESTRICTED_TYPE;
import com.py.py.enumeration.SORT_OPTION;
import com.py.py.enumeration.TIME_OPTION;
import com.py.py.generic.Filter;

public class PyUtils {

	public static boolean stringCompare(String a, String b) {
		if(a == null) {
			return (b == null);
		} else if(b == null) {
			return false;
		}
		return a.equals(b);
	}
	
	public static boolean objectIdCompare(ObjectId a, ObjectId b) {
		if(a == null) {
			return (b == null);
		} else if(b == null) {
			return false;
		}
		return a.equals(b);
	}
	
	public static boolean doubleCompare(Double a, Double b) {
		if(a == null) {
			return (b == null);
		} else if(b == null) {
			return false;
		}
		return a.equals(b);
	}
	
	public static boolean longCompare(Long a, Long b) {
		if(a == null) {
			return (b == null);
		} else if(b == null) {
			return false;
		}
		return a.equals(b);
	}
	
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public static boolean isFloat(String s) {
		try {
			Float.parseFloat(s);
		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public static boolean isLong(String s) {
		try {
			Long.parseLong(s);
		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public static boolean isDouble(String s) {
		try {
			Double.parseDouble(s);
		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	protected static String formatCurrency(BigDecimal c, int round) {
		return formatBD(c, round).toString();
	}
	
	public static String formatCurrencyUp(BigDecimal c) {
		return formatCurrency(c, BigDecimal.ROUND_CEILING);
	}
	
	public static String formatCurrencyDown(BigDecimal c) {
		return formatCurrency(c, BigDecimal.ROUND_FLOOR);
	}
	
	protected static String formatCurrency(double c, int round) {
		return formatBD(c, round).toString();
	}
	
	public static String formatCurrencyUp(double c) {
		return formatCurrency(c, BigDecimal.ROUND_CEILING);
	}
	
	public static String formatCurrencyDown(double c) {
		return formatCurrency(c, BigDecimal.ROUND_FLOOR);
	}
	
	protected static BigDecimal formatBD(BigDecimal c, int round) {
		if(c == null) {
			c = new BigDecimal(Double.toString(0.0d));
		}
		return c.setScale(ServiceValues.PAYMENT_DOUBLE_PRECISION, round);
	}
	
	public static BigDecimal formatBDUp(BigDecimal c) {
		return formatBD(c, BigDecimal.ROUND_CEILING);
	}
	
	public static BigDecimal formatBDDown(BigDecimal c) {
		return formatBD(c, BigDecimal.ROUND_FLOOR);
	}
	
	public static BigDecimal formatBDHalfUp(BigDecimal c) {
		return formatBD(c, BigDecimal.ROUND_HALF_UP);
	}
	
	protected static BigDecimal formatBD(double c, int round) {
		BigDecimal bd = new BigDecimal(Double.toString(c));
		return bd.setScale(ServiceValues.PAYMENT_DOUBLE_PRECISION, round);
	}
	
	public static BigDecimal formatBDUp(double c) {
		return formatBD(c, BigDecimal.ROUND_CEILING);
	}
	
	public static BigDecimal formatBDDown(double c) {
		return formatBD(c, BigDecimal.ROUND_FLOOR);
	}
	
	protected static long formatCoins(long c, int round) {
		BigDecimal bd = new BigDecimal(Double.toString(c));
		bd = bd.setScale(0, round);
		return bd.longValue();
	}
	
	public static long formatCoinsUp(long c) {
		return formatCoins(c, BigDecimal.ROUND_CEILING);
	}
	
	public static long formatCoinsDown(long c) {
		return formatCoins(c, BigDecimal.ROUND_FLOOR);
	}
	
	public static Date getOldDate(long fromNow) {
		return new Date((new Date()).getTime() - fromNow);
	}
	
	public static Date getTime(TIME_OPTION time) {
		Date now = new Date();
		Date then = new Date();
		if(TIME_OPTION.HOUR.equals(time)) {
			then.setTime(now.getTime() - TimeValues.TIME_HOUR);
		} else if(TIME_OPTION.DAY.equals(time)) {
			then.setTime(now.getTime() - TimeValues.TIME_DAY);
		} else if(TIME_OPTION.MONTH.equals(time)) {
			then.setTime(now.getTime() - TimeValues.TIME_MONTH);
		} else if(TIME_OPTION.YEAR.equals(time)) {
			then.setTime(now.getTime() - TimeValues.TIME_YEAR);
		} else {
			// all time
			return null;
		}
		return then;
	}
	
	public static FEEDBACK_TYPE getFeedbackType(String type, 
			FEEDBACK_TYPE defaultValue) {
		if(type == null || type.isEmpty()) {
			return defaultValue;
		}
		try {
			return FEEDBACK_TYPE.valueOf(type.toUpperCase());
		} catch(Exception e) {
			return defaultValue;
		}
	}
	
	public static FEEDBACK_STATE getFeedbackState(String state, 
			FEEDBACK_STATE defaultValue) {
		if(state == null || state.isEmpty()) {
			return defaultValue;
		}
		try {
			return FEEDBACK_STATE.valueOf(state.toUpperCase());
		} catch(Exception e) {
			return defaultValue;
		}
	}
	
	public static FEEDBACK_CONTEXT getFeedbackContext(String context, 
			FEEDBACK_CONTEXT defaultValue) {
		if(context == null || context.isEmpty()) {
			return defaultValue;
		}
		try {
			return FEEDBACK_CONTEXT.valueOf(context.toUpperCase());
		} catch(Exception e) {
			return defaultValue;
		}
	}
	
	public static ADMIN_TYPE getAdminType(String type, 
			ADMIN_TYPE defaultValue) {
		if(type == null || type.isEmpty()) {
			return defaultValue;
		}
		try {
			return ADMIN_TYPE.valueOf(type.toUpperCase());
		} catch(Exception e) {
			return defaultValue;
		}
	}
	
	public static ADMIN_STATE getAdminState(String state, 
			ADMIN_STATE defaultValue) {
		if(state == null || state.isEmpty()) {
			return defaultValue;
		}
		try {
			return ADMIN_STATE.valueOf(state.toUpperCase());
		} catch(Exception e) {
			return defaultValue;
		}
	}
	
	public static RESTRICTED_TYPE getRestrictedType(String type, 
			RESTRICTED_TYPE defaultValue) {
		if(type == null || type.isEmpty()) {
			return defaultValue;
		}
		try {
			return RESTRICTED_TYPE.valueOf(type.toUpperCase());
		} catch(Exception e) {
			return defaultValue;
		}
	}
	
	public static FLAG_TYPE getFlagType(String type, 
			FLAG_TYPE defaultValue) {
		if(type == null || type.isEmpty()) {
			return defaultValue;
		}
		try {
			return FLAG_TYPE.valueOf(type.toUpperCase());
		} catch(Exception e) {
			return defaultValue;
		}
	}
	
	public static FLAG_REASON getFlagReason(String reason, FLAG_REASON defaultValue) {
		if(reason == null || reason.isEmpty()) {
			return defaultValue;
		}
		try {
			return FLAG_REASON.valueOf(reason.toUpperCase());
		} catch(Exception e) {
			return defaultValue;
		}
	}
	
	public static TIME_OPTION convertTimeOption(String time, TIME_OPTION defaultValue) {
		if(time == null || time.isEmpty()) {
			return defaultValue;
		} else if(PyUtils.stringCompare(time.toUpperCase(), ParamValues.TIME_OPTION_HOUR)) {
			return TIME_OPTION.HOUR;
		} else if(PyUtils.stringCompare(time.toUpperCase(), ParamValues.TIME_OPTION_DAY)) {
			return TIME_OPTION.DAY;
		} else if(PyUtils.stringCompare(time.toUpperCase(), ParamValues.TIME_OPTION_MONTH)) {
			return TIME_OPTION.MONTH;
		} else if(PyUtils.stringCompare(time.toUpperCase(), ParamValues.TIME_OPTION_YEAR)) {
			return TIME_OPTION.YEAR;
		} else if(PyUtils.stringCompare(time.toUpperCase(), ParamValues.TIME_OPTION_ALLTIME)) {
			return TIME_OPTION.ALLTIME;
		} else {
			return defaultValue;
		}
	}
	
	public static TIME_OPTION getPreviousTimeOption(TIME_OPTION segment) {
		if(segment == null) {
			return null;
		} else if(segment == TIME_OPTION.HOUR) {
			return null;
		} else if(segment == TIME_OPTION.DAY) {
			return TIME_OPTION.HOUR;
		} else if(segment == TIME_OPTION.MONTH) {
			return TIME_OPTION.DAY;
		} else if(segment == TIME_OPTION.YEAR) {
			return TIME_OPTION.MONTH;
		} else if(segment == TIME_OPTION.ALLTIME) {
			return TIME_OPTION.YEAR;
		}
		return null;
	}
	
	public static TIME_OPTION getNextTimeOption(TIME_OPTION segment) {
		if(segment == null) {
			return null;
		} else if(segment == TIME_OPTION.HOUR) {
			return TIME_OPTION.DAY;
		} else if(segment == TIME_OPTION.DAY) {
			return TIME_OPTION.MONTH;
		} else if(segment == TIME_OPTION.MONTH) {
			return TIME_OPTION.YEAR;
		} else if(segment == TIME_OPTION.YEAR) {
			return TIME_OPTION.ALLTIME;
		} else if(segment == TIME_OPTION.ALLTIME) {
			return null;
		}
		return null;
	}
	
	public static String convertTimeOption(TIME_OPTION time) {
		if(time == null) {
			return null;
		}
		return time.toString();
	}
	
	public static SORT_OPTION convertSortOption(String sort, SORT_OPTION defaultValue) {
		if(sort == null || sort.isEmpty()) {
			return defaultValue;
		} else if(PyUtils.stringCompare(sort.toUpperCase(), ParamValues.SORT_OPTION_VALUE)) {
			return SORT_OPTION.VALUE;
		} else if(PyUtils.stringCompare(sort.toUpperCase(), ParamValues.SORT_OPTION_PROMOTION)) {
			return SORT_OPTION.PROMOTION;
		} else if(PyUtils.stringCompare(sort.toUpperCase(), ParamValues.SORT_OPTION_COST)) {
			return SORT_OPTION.COST;
		} else {
			return defaultValue;
		}
	}
	
	public static String convertSortOption(SORT_OPTION sort) {
		if(sort == null) {
			return null;
		}
		return sort.toString().toLowerCase();
	}
	
	public static <T> List<String> stringifiedList(List<T> list) {
		if(list == null) {
			return null;
		}
		List<String> ret = new ArrayList<String>();
		for(T t: list) {
			ret.add(t.toString());
		}
		return ret;
	}
	
	public static Filter constructFilter(SORT_OPTION sort, TIME_OPTION time, 
			Boolean warning, List<String> tags) {
		Filter filter = new Filter();
		filter.setTags(tags);
		filter.setTime(time);
		filter.setSort(sort);
		filter.setWarning(warning);
		return filter;
	}
	
	public static String getTag(String tag) {
		if(tag == null || tag.isEmpty()) {
			return null;
		} else {
			if(tag.contains(" ")) {
				String correctTag = tag.replaceAll("\\s", "");
				if(correctTag == null || correctTag.isEmpty()) {
					return null;
				}
				return correctTag.toLowerCase();
			}
			if(!tag.matches(DomainRegex.TAG)) {
				return null;
			}
		}
		return tag.toLowerCase();
	}
	
	public static List<String> getTags(String tags) {
		if(tags == null || tags.isEmpty()) {
			// no elements
			return new ArrayList<String>();
		} else if(!tags.contains(DomainRegex.TAG_DELIMITER_STRING)) {
			// one element
			List<String> list = new ArrayList<String>();
			String tag = getTag(tags);
			if(tag != null) {
				list.add(tags);
			}
			return list;
		}
		// more than one element
		List<String> tagList = new ArrayList<String>();
		String[] tagArray = tags.split(DomainRegex.TAG_DELIMITER, ServiceValues.TAGS_ADD_MAX);
		for(String tag : tagArray) {
			String correctTag = getTag(tag);
			if(correctTag != null && !correctTag.isEmpty()) {
				tagList.add(correctTag);
			}
		}
		return tagList;
	}
	
	public static <K, V extends Comparable<? super V> > List<Map.Entry<K, V> > sortByValue(Map<K, V> map, Comparator<Map.Entry<?, V> > comparator) {
		final int size = map.size();
		final List<Map.Entry<K, V> > reusedList = new ArrayList<Map.Entry<K, V> >(size);
		final List<Map.Entry<K, V> > meView = reusedList;
		meView.addAll(map.entrySet());
		Collections.sort(meView, comparator);
		final List<Map.Entry<K, V>> keyView = reusedList;
		for (int i = 0; i < size; i++) {
			keyView.set(i,  meView.get(i));
		}
		return keyView;
	}
	
	public static <K, V extends Comparable<? super V> > List<Map.Entry<K, V> > sortByValueAscending(Map<K, V> map) {
		return sortByValue(map, new AscendingValueComparator<V>());
	}
	
	public static <K, V extends Comparable<? super V> > List<Map.Entry<K, V> > sortByValueDescending(Map<K, V> map) {
		return sortByValue(map, new DescendingValueComparator<V>());
	}
	
	private static class AscendingValueComparator<V extends Comparable<? super V> > 
		implements Comparator<Map.Entry<?, V> > {
			public int compare(Map.Entry<?, V> o1, Map.Entry<?, V> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
	}
	
	private static class DescendingValueComparator<V extends Comparable<? super V> > 
		implements Comparator<Map.Entry<?, V> > {
			public int compare(Map.Entry<?, V> o1, Map.Entry<?, V> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
	}
	
	public static long convertToAppreciation(long a) {
		return (new BigDecimal(Double.toString(convertToCurrency(a)))).setScale(ServiceValues.PAYMENT_NO_PRECISION, BigDecimal.ROUND_FLOOR).longValue();
	}
	
	public static BigDecimal convertBDFromString(String a) {
		try {
			return PyUtils.formatBDDown(new BigDecimal(a));
		} catch(Exception e) {
			return new BigDecimal(Double.toString(0.0d));
		}
	}
	
	public static long convertFromAppreciation(String a) {
		try {
			return convertFromCurrency(convertBDFromString(a));
		} catch(Exception e) {
			return 0l;
		}
	}
	
	public static double convertToCurrency(long c) {
		return c * .01d;
	}
	
	public static double convertToCurrency(BigDecimal c) {
		if(c == null) {
			return 0.0d;
		}
		return c.doubleValue();
	}
	
	public static long convertFromCurrency(double c) {
		return convertFromCurrency(formatBDDown(c));
	}
	
	public static long convertFromCurrency(BigDecimal c) {
		return formatBDDown(c).multiply(new BigDecimal(100l)).longValue();
	}
	
	public static boolean overUserFlagThreshold(long weight, double flagValue, 
			long flagCount) {
		if(flagCount < ServiceValues.FLAG_USER_COUNT_THRESHOLD_MIN) {
			return false;
		} else if(flagCount > ServiceValues.FLAG_USER_COUNT_THRESHOLD_MAX) {
			return true;
		}
		long w = 1;
		if(weight > 0) {
			w = weight;
		}
		if((flagValue / w) > ServiceValues.FLAG_USER_VALUE_THRESHOLD) {
			return true;
		}
		
		return false;
	}
	
	public static boolean overFlagThreshold(long value, 
			long appreciationCount, long flagValue, long flagCount) {
		if(flagCount < ServiceValues.FLAG_COUNT_THRESHOLD_MIN) {
			return false;
		} else if(flagCount >= ServiceValues.FLAG_COUNT_THRESHOLD_MAX) {
			return true;
		}
		long a = 1;
		if(value > 0) {
			a = value;
		}
		if(a > ServiceValues.FLAG_DENOMINATOR_MAX) {
			a = ServiceValues.FLAG_DENOMINATOR_MAX;
		}
		if((flagValue / a) > ServiceValues.FLAG_VALUE_THRESHOLD) {
			return true;
		}
		
		return false;
	}
	
	public static Date calculateSuspension(long suspensions, Date now) {
		if(now == null || suspensions <= 0) {
			return null;
		}
		long addedTime = 0;
		if(suspensions == 1) {
			addedTime = TimeValues.TIME_HOUR;
		} else if(suspensions == 2) {
			addedTime = TimeValues.TIME_DAY;
		} else if(suspensions == 3) {
			addedTime = TimeValues.TIME_MONTH;
		} else {
			addedTime = TimeValues.TIME_YEAR;
		}
		return new Date(now.getTime() + addedTime);
	}
	
	public static boolean overWarnThreshold(long appreciation, long warnValue) {
		if(warnValue < ServiceValues.WARN_VALUE_MIN) {
			return false;
		}
		double a = ServiceValues.WARN_APPRECIATION_MIN;
		double app = convertToCurrency(appreciation);
		if(app >= ServiceValues.WARN_APPRECIATION_MIN) {
			a = app;
		}
		
		if((warnValue / a) > ServiceValues.WARN_VALUE_THRESHOLD) {
			return true;
		}
		return false;
	}
	
	public static Map<String, String> constructConstantMap(Class<?> clazz) {
		Map<String, String> m = new HashMap<String, String>();
		for(Field f : clazz.getDeclaredFields()) {
			f.setAccessible(true);
			try {
				if(f.getType() == String.class) {
					m.put(f.getName(), (String)f.get(null));
				} else {
					m.put(f.getName(), (String)f.get(null).toString());
				}
			} catch(IllegalAccessException e) {
				// do nothing
			}
		}
		return m;
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String, List<String> > constructConstantListMap(Class<?> clazz) {
		Map<String, List<String> > m = new HashMap<String, List<String> >();
		for(Field f : clazz.getDeclaredFields()) {
			f.setAccessible(true);
			try {
				if(f.getType() == List.class) {
					m.put(f.getName(), (List<String>)f.get(null));
				}
			} catch(IllegalAccessException e) {
				// do nothing
			}
		}
		return m;
	}
	
	public static List<ObjectId> objectIdList(List<String> ids) {
		List<ObjectId> list = new ArrayList<ObjectId>();
		if(ids == null) {
			return list;
		}
		for(String id : ids) {
			try {
				list.add(new ObjectId(id));
			} catch(Exception e) {
				// do nothing
			}
		}
		return list;
	}
	
}
