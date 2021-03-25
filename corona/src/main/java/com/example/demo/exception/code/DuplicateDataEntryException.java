package com.example.demo.exception.code;

import com.example.demo.exception.ServiceException;

public class DuplicateDataEntryException extends ServiceException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateDataEntryException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DuplicateDataEntryException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DuplicateDataEntryException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DuplicateDataEntryException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DuplicateDataEntryException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
