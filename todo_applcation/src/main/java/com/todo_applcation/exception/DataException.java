package com.todo_applcation.exception;

/**
 * @author Aravind
 * 
 * Class created for DataException control
 *
 */

public class DataException extends RuntimeException {
	private static final long serialVersionUID = -9079454849611061074L;

	public DataException() {
		super();
	}

	public DataException(final String message) {
		super(message);
	}
}
