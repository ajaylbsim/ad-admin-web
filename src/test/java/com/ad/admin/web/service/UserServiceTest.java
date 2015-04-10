package com.ad.admin.web.service;

import org.junit.Assert;
import org.junit.Ignore;
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
    User user = new User("Karan", "Gujral");
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

}
