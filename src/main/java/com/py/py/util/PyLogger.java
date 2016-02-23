package com.py.py.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PyLogger {

	protected Logger logger = LoggerFactory.getLogger(PyLogger.class);
	
	protected final String genericMessage = "An exception has occurred!";
	
	protected static String encode(String message) {
		if(message == null) {
			return message;
		}
		return message.replace('\n', '_').replace('\r', '_');
	}

	public static PyLogger getLogger(Class<?> clazz) {
		PyLogger l = new PyLogger();
		l.logger = LoggerFactory.getLogger(clazz);
		return l;
	}
	
	public void debug(String message) {
		if(logger.isDebugEnabled()) {
			logger.debug(encode(message));
		}
	}
	
	public void debug(Throwable t) {
		if(logger.isDebugEnabled()) {
			logger.debug(genericMessage, t);
		}
	}
	
	public void debug(String message, Throwable t) {
		if(logger.isDebugEnabled()) {
			logger.debug(encode(message), t);
		}
	}
	
	public void info(String message) {
		if(logger.isInfoEnabled()) {
			logger.info(encode(message));
		}
	}
	
	public void info(Throwable t) {
		if(logger.isInfoEnabled()) {
			logger.info(genericMessage, t);
		}
	}
	
	public void info(String message, Throwable t) {
		if(logger.isInfoEnabled()) {
			logger.info(encode(message), t);
		}
	}
	
	public void error(String message) {
		if(logger.isErrorEnabled()) {
			logger.error(encode(message));
		}
	}
	
	public void error(Throwable t) {
		if(logger.isErrorEnabled()) {
			logger.error(genericMessage, t);
		}
	}
	
	public void error(String message, Throwable t) {
		if(logger.isErrorEnabled()) {
			logger.error(encode(message), t);
		}
	}
	
	public void trace(String message) {
		if(logger.isTraceEnabled()) {
			logger.trace(encode(message));
		}
	}
	
	public void trace(Throwable t) {
		if(logger.isTraceEnabled()) {
			logger.trace(genericMessage, t);
		}
	}
	
	public void trace(String message, Throwable t) {
		if(logger.isTraceEnabled()) {
			logger.trace(encode(message), t);
		}
	}
	
	public void warn(String message) {
		if(logger.isWarnEnabled()) {
			logger.warn(encode(message));
		}
	}
	
	public void warn(Throwable t) {
		if(logger.isWarnEnabled()) {
			logger.warn(genericMessage, t);
		}
	}
	
	public void warn(String message, Throwable t) {
		if(logger.isWarnEnabled()) {
			logger.warn(encode(message), t);
		}
	}
}
