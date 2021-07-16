package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyException extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> errorMessage(Exception e){
		ErrorMessage errorMessage= new ErrorMessage(e.getMessage(),"Something went wrong");
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
