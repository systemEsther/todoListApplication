package com.todo_applcation.exception;

/**
 * @author Aravind
 * 
 * Class created for DataException control
 *
 */

public class SQLException extends RuntimeException {
	private static final long serialVersionUID = -9079454849611061074L;

	public SQLException() {
		super();
	}

	public SQLException(final String message) {
		super(message);
	}
}
