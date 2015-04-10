package com.ad.admin.web.domain;

public class User {

  private long id;

  private String userName;
  
  private String firstName;

  private String lastName;
  
  private String password;

  protected User() {}
  
  public User(String userName,String password){
    this.userName = userName;
    this.password = password;
  }

  public User(long id, String userName, String firstName, String lastName, String password) {
    super();
    this.id = id;
    this.userName = userName;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
        + ", password=" + password + "]";
  }

  
  
}
