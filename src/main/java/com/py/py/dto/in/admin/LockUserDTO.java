package com.py.py.dto.in.admin;

import java.util.Date;

import com.py.py.dto.DTO;
import com.py.py.enumeration.LOCK_REASON;

public class LockUserDTO extends DTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3971282161548531486L;
	private LOCK_REASON lockReason;
	private Long suspensions;
	private Date lockedUntil;
	
	public LockUserDTO() {
	}

	public LOCK_REASON getLockReason() {
		return lockReason;
	}

	public void setLockReason(LOCK_REASON lockReason) {
		this.lockReason = lockReason;
	}

	public Long getSuspensions() {
		return suspensions;
	}

	public void setSuspensions(Long suspensions) {
		this.suspensions = suspensions;
	}

	public Date getLockedUntil() {
		return lockedUntil;
	}

	public void setLockedUntil(Date lockedUntil) {
		this.lockedUntil = lockedUntil;
	}
}
