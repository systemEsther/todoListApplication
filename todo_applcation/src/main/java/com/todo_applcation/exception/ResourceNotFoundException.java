package com.todo_applcation.exception;


/**
 * @author Aravind
 * 
 * Custom class created for Resource not found
 */
public class ResourceNotFoundException  extends Exception {
	
    private static final long serialVersionUID = -9079454849611061074L;

    

    public ResourceNotFoundException() {
        super();
    }

 

    public ResourceNotFoundException(final String message) {
        super(message);
    }

 

}
