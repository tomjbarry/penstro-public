package com.py.py.dto.out;

import java.util.List;

import com.py.py.dto.DTO;
import com.py.py.generic.ValidationError;

public class ValidationErrorDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6105425739118419178L;
	private List<ValidationError> errors;
	
	public ValidationErrorDTO() {
	}

	public List<ValidationError> getErrors() {
		return errors;
	}

	public void setErrors(List<ValidationError> errors) {
		this.errors = errors;
	}
}
