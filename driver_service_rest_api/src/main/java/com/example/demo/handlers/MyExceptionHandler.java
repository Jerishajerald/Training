package com.example.demo.handlers;
import java.time.LocalDateTime;

import org.hibernate.annotations.common.util.impl.Log;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.models.ErrorMessage;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestControllerAdvice
public class MyExceptionHandler {
    
	@ExceptionHandler(value=Exception.class)
	public ErrorMessage handleAll(Exception ex,WebRequest req)
	{
		log.error(ex.getMessage());
		return new ErrorMessage(ex.getMessage(),LocalDateTime.now(),req.getDescription(false));
		
	}

	
	
}
