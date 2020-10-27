package com.sz.springboottest.mvc;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionDemo2 {

  @ModelAttribute("other")
  public User getUser() {
    User user = new User();
    user.setAge(3);
    System.out.println("other");
    user.setName("other");
    return user;
  }

}
