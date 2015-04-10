package com.ad.admin.web.util;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ad.admin.web.domain.enums.ErrorCode;
import com.ad.admin.web.exception.UserNotFoundException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  private static final Logger LOGGER = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);

  @ExceptionHandler(value = {Exception.class})
  protected ResponseEntity<RestResponse> handleUnknownException(Exception ex, WebRequest request) {
    LOGGER.error(ex.getMessage(), ex);
    return new ResponseEntity<RestResponse>(new RestResponse(Boolean.FALSE, ErrorCode.GENERIC_ERROR.getDescription(),
        ErrorCode.GENERIC_ERROR, null), HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(value = {UserNotFoundException.class})
  protected ResponseEntity<RestResponse> handleUserNotFoundException(Exception ex, WebRequest request) {
    LOGGER.error(ex.getMessage(), ex);
    return new ResponseEntity<RestResponse>(new RestResponse(Boolean.FALSE, ErrorCode.USER_NOT_FOUND.getDescription(),
        ErrorCode.USER_NOT_FOUND, null), HttpStatus.NOT_FOUND);
  }
  
  @Override
  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers,
      HttpStatus status, WebRequest request) {
    return new ResponseEntity<Object>(new RestResponse(Boolean.FALSE, convertConstraintViolation(ex), null), HttpStatus.BAD_REQUEST);
  }

  private List<String> convertConstraintViolation(MethodArgumentNotValidException ex) {
    List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
    List<String> errorMessages = new ArrayList<String>();
    for (FieldError c : fieldErrors) {
      StringBuilder builder = new StringBuilder("[").append(c.getField()).append("] ").append(c.getDefaultMessage());
      errorMessages.add(builder.toString());
    }
    return errorMessages;
  }

}
