package com.ad.admin.web.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.ad.admin.web.domain.User;
import com.ad.admin.web.exception.UserNotFoundException;
import com.ad.admin.web.services.UserService;
import com.ad.admin.web.util.RestTemplateErrorHandler;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private RestTemplate restTemplate;

  @Value("${base.api.url}")
  private String baseApiUrl;

  @Override
  public User save(User user) {
    ResponseEntity<User> responseEntity = restTemplate.postForEntity(baseApiUrl + "user", user, User.class);
    return responseEntity.getBody();
  }

  @Override
  public User findById(Long id) throws UserNotFoundException {
    ResponseEntity<User> responseEntity = restTemplate.getForEntity(baseApiUrl + "user/" + id, User.class);
    if (RestTemplateErrorHandler.isError(responseEntity.getStatusCode())) {
      throw new UserNotFoundException();
    }
    return responseEntity.getBody();
  }

  @Override
  public User login(User user) throws UserNotFoundException {
    valiDateString(user.getUserName());
    valiDateString(user.getPassword());
    ResponseEntity<User> responseEntity = restTemplate.getForEntity(baseApiUrl + "user/" + user.getId(), User.class);
    if (RestTemplateErrorHandler.isError(responseEntity.getStatusCode())) {
      throw new UserNotFoundException();
    }
    User userLoggedIn = responseEntity.getBody();
    if(!(userLoggedIn.getUserName().equalsIgnoreCase(user.getUserName()))||!(userLoggedIn.getPassword().equalsIgnoreCase(user.getPassword()))){
      throw new UserNotFoundException();
    }
    return responseEntity.getBody();
  }
  
  private void valiDateString(String value){
    if(StringUtils.isEmpty(value)){
      throw new IllegalArgumentException();
    }
  }
}
