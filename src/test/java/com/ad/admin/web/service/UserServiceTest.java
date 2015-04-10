package com.ad.admin.web.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ad.admin.web.BaseTest;
import com.ad.admin.web.domain.User;
import com.ad.admin.web.exception.UserNotFoundException;
import com.ad.admin.web.services.UserService;

public class UserServiceTest extends BaseTest {

  @Autowired
  private UserService userService;

  @Test
  public void shouldBeAbleToSaveUser() {
    User user = new User(2L,"kgujral@gmail.com","Karan", "Gujral","k-password");
    user.setId(2L);
    user = userService.save(user);
    Assert.assertNotNull(user);
    Assert.assertNotNull(user.getId());
    Assert.assertEquals("Karan", user.getFirstName());
  }

  @Test
  public void shouldBeAbleToFindById() throws UserNotFoundException {
    User user = userService.findById(2L);
    Assert.assertNotNull(user);
    Assert.assertEquals(2L, user.getId());
    Assert.assertEquals("Karan", user.getFirstName());
  }

  @Test(expected = UserNotFoundException.class)
  public void shouldThrowExceptionIfUserDoesNotExist() throws UserNotFoundException {
    userService.findById(2000000L);
  }

  @Test
  public void shouldBeAbleToLogingByAppropriateCredential() throws UserNotFoundException{
    User user =new User("kgujral@gmail.com","k-password");
    user.setId(2L);
    User logedInUser = userService.login(user);
    Assert.assertNotNull(user);
    Assert.assertEquals(user.getUserName(),logedInUser.getUserName());
    Assert.assertEquals(user.getPassword(),logedInUser.getPassword());
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowExceptionIfUserNameIsEmptyOrNullWhileLoggingIntoSystem() throws UserNotFoundException {
    User user = new User(null,"kdr");
    userService.login(user);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowExceptionIfPasswordIsEmptyOrNullWhileLoggingIntoSystem() throws UserNotFoundException {
    User user = new User("Ajay","");
    userService.login(user);
  }
  
  
}
