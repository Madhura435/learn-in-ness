package com.madhura.valiframe.second;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.net.ssl.SSLEngineResult.Status;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler {
@Override
protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
		HttpHeaders headers, HttpStatus status, WebRequest request) {
	/* First way of Handling
	Map<String,String> errors=new HashMap();
	ex.getBindingResult().getAllErrors().forEach((error)->
	{
		String fieldName=((FieldError)error).getField();
		String message=error.getDefaultMessage();
		errors.put(fieldName,message);
	});
	return new ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST); */
	
	// Second way of handling methods
	Map<String,Object> body=new LinkedHashMap<>();
	body.put("time_Stamp",new Date());
	body.put("status", status.value());
	List<String> errors=ex.getBindingResult().getFieldErrors().stream().
			map(x->x.getDefaultMessage()).collect(Collectors.toList());
	body.put("errors", errors);
	return new ResponseEntity<>(body,headers,status);
}

@ExceptionHandler(ConstraintViolationException.class)
public void constraintViolationException(HttpServletResponse response) throws IOException
{
	response.sendError(HttpStatus.BAD_REQUEST.value());
}

}
