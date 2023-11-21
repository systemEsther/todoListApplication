package com.todo_applcation.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

public class FileParserException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	final String errorMessage;

}
