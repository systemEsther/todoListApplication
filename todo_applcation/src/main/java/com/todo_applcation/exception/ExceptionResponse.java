package com.todo_applcation.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;


/**
 * @author Aravind
 * 
 * Class created for Exception response 
 */
@Getter
@Setter
public class ExceptionResponse {
	
	private Date timestamp;
	private int status;
	private HttpStatus httpStatus;
	private String responseMessage;
	private String requestURL;

}
