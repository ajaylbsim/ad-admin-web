package com.ad.admin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ad.admin.web.domain.User;
import com.ad.admin.web.exception.UserNotFoundException;
import com.ad.admin.web.services.UserService;
import com.ad.admin.web.util.RestResponse;


@Controller
@RequestMapping(value = "/control-panel")
public class LoginController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity<RestResponse> login(@RequestBody User user) throws UserNotFoundException {
    user.setId(2L);
    System.out.println(user.toString());
    return new ResponseEntity<RestResponse>(
        new RestResponse(Boolean.TRUE, "Login Successfull", userService.login(user)), HttpStatus.OK);
  }

}
