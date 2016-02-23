package com.py.py.dto.out;

import java.util.Map;

import com.py.py.dto.DTO;
import com.py.py.enumeration.FLAG_TYPE;

public class FlagDataDTO extends DTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6299053972987511809L;
	protected String referenceId;
	protected String target;
	protected FLAG_TYPE type;
	protected long value = 0L;
	protected long total = 0L;
	protected Map<String, Long> reasons = null;
	
	public FlagDataDTO() {
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public FLAG_TYPE getType() {
		return type;
	}

	public void setType(FLAG_TYPE type) {
		this.type = type;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public Map<String, Long> getReasons() {
		return reasons;
	}

	public void setReasons(Map<String, Long> reasons) {
		this.reasons = reasons;
	}
	
}
