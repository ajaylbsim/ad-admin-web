package com.ad.admin.web.services;

import com.ad.admin.web.domain.User;
import com.ad.admin.web.exception.UserNotFoundException;

public interface UserService {

  public User save(User user);
  
  public User findById(Long id) throws UserNotFoundException;
  
  public User findByUserNameAndPassword(String userName,String password);
}
