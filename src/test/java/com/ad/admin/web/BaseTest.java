package com.ad.admin.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AdAdminWebApplication.class)
@WebAppConfiguration
public class BaseTest {
  
  @Test
  public void contextLoads() {
    Assert.isTrue(Boolean.TRUE);
  }
  
}
