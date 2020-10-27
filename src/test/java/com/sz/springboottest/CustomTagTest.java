package com.sz.springboottest;

import com.sz.springboottest.customlabel.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述类的作用
 *
 * @author abel
 * @date 2020/10/9 22:38
 */
public class CustomTagTest {
  public static void main(String[] args) {
    ApplicationContext bf = new ClassPathXmlApplicationContext("test/customtag/test.xml");
    User user = (User) bf.getBean("testBean");
    System.out.println(user);
  }
}
