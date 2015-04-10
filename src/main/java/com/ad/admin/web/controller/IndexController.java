package com.ad.admin.web.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index() throws IOException {
    return "index";
  }
  

  @RequestMapping(value = "/home/**", method = RequestMethod.GET)
  public String home(Model model, @ModelAttribute("order") final Object order) {
    model.addAttribute("order", order);
    return "index";
  }
}
