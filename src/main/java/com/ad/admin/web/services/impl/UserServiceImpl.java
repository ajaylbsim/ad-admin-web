package com.ad.admin.web.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
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
  public User findByUserNameAndPassword(String userName, String password) {
    return null;
  }

  @Override
  public User findById(Long id) throws UserNotFoundException {
    ResponseEntity<User> responseEntity = restTemplate.getForEntity(baseApiUrl + "user/" + id, User.class);
    if (RestTemplateErrorHandler.isError(responseEntity.getStatusCode())) {
      throw new UserNotFoundException();
    }
    return responseEntity.getBody();
  }

}
