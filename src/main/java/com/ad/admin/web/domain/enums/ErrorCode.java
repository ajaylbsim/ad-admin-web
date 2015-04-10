package com.ad.admin.web.domain.enums;


import org.springframework.http.HttpStatus;


public enum ErrorCode {
  RESOURSE_NOT_FOUND(4001, "Resourse Not Found", HttpStatus.NOT_FOUND),
  USER_NOT_FOUND(4002, "User Not Found", HttpStatus.NOT_FOUND),
  GENERIC_ERROR(5000, "Something bad happened !",
      HttpStatus.EXPECTATION_FAILED);
  private final Integer code;

  private final String description;

  private final HttpStatus httpStatus;

  private ErrorCode(Integer code, String description, HttpStatus httpStatus) {
    this.code = code;
    this.description = description;
    this.httpStatus = httpStatus;
  }

  public Integer getErrorCode() {
    return code;
  }

  public String getDescription() {
    return description;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  public String errorMessage() {
    return this.description;
  }
}
