package com.todo_applcation.exception;

/**
 * @author Aravind
 * 
 * Custom class created for RecordNotFoundException
 *
 */
public class RecordNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -9079454849611061074L;

	public RecordNotFoundException() {
		super();
	}

	public RecordNotFoundException(final String message) {
		super(message);
	}

}
