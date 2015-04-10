package com.ad.admin.web.exception;

public class UserNotFoundException extends Exception {

  private static final long serialVersionUID = -7687209848203066257L;

  private static final String DEFAULT_MESSAGE = "User not found !";

  public UserNotFoundException() {
    this(DEFAULT_MESSAGE);
  }

  public UserNotFoundException(String message) {
    super(message);
  }
}
