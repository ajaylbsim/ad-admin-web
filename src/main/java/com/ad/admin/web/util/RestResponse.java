package com.ad.admin.web.util;

import java.io.Serializable;
import java.util.List;

import com.ad.admin.web.domain.enums.ErrorCode;
import com.google.common.collect.ImmutableList;

public class RestResponse implements Serializable {

  private static final long serialVersionUID = -8232988788254453023L;

  private Boolean success;

  private List<String> messages;

  private Object data;

  private Integer errorCode;

  private String errorDescripton;

  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorDescripton() {
    return errorDescripton;
  }

  public void setErrorDescripton(String errorDescripton) {
    this.errorDescripton = errorDescripton;
  }

  public RestResponse(Boolean success, List<String> messages, Object data, Integer errorCode, String errorDescripton) {
    super();
    this.success = success;
    this.messages = messages;
    this.data = data;
    this.errorCode = errorCode;
    this.errorDescripton = errorDescripton;
  }

  public RestResponse(Boolean success, List<String> messages, ErrorCode errorCode, Object data) {
    this(success, messages, data, errorCode.getErrorCode(), errorCode.getDescription());
  }

  public RestResponse(Boolean success, String message, ErrorCode errorCode, Object data) {
    this(success, ImmutableList.of(message), data, errorCode.getErrorCode(), errorCode.getDescription());
  }

  public RestResponse(Boolean success, List<String> messages, Object data) {
    this(success, messages, data, null, null);
  }

  public RestResponse(Boolean success, String message, Object data) {
    this(success, ImmutableList.of(message), data);
  }

  public RestResponse(Boolean success, Object data) {
    this(success, "", data);
  }

  public RestResponse() {
    super();
  }

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

}
