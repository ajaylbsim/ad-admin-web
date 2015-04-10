package com.ad.admin.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.ad.admin.web.util.RestTemplateErrorHandler;

@SpringBootApplication
public class AdAdminWebApplication {

  public static void main(String[] args) {
    SpringApplication.run(AdAdminWebApplication.class, args);
  }

  @Bean(name = "restTemplate")
  public RestTemplate restTemplate() {
    RestTemplate template = new RestTemplate();
    template.setErrorHandler(new RestTemplateErrorHandler());
    return template;
  }
}
