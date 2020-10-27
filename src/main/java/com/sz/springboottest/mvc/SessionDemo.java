package com.sz.springboottest.mvc;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class SessionDemo {

  @ModelAttribute("xiaoming")
  public User getUser() {
    User user = new User();
    user.setAge(1);
    user.setName("xiaoming");
    System.out.println("xiaoming");
    return user;
  }


  @ModelAttribute("xiaohong")
  public User getUserTwo() {
    User user = new User();
    user.setAge(1);
    user.setName("xiaohong");
    System.out.println("xiaohong");
    return user;
  }


  @RequestMapping("testUser")
  public void testUser(ModelMap modelMap) {
    User xiaoming = (User) modelMap.get("xiaoming");
    User xiaohong = (User) modelMap.get("xiaohong");
    System.out.println(xiaoming.getAge());
    System.out.println(xiaohong.getAge());
  }


}
