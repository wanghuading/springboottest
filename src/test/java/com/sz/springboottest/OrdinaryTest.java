package com.sz.springboottest;

import java.util.Properties;

public class OrdinaryTest {
  public static void main(String[] args) {
    systemPropertyTest();
  }

  public static void systemPropertyTest() {
//    String property = System.getProperty("content.types.user.table");
//    System.out.println(property);

    Properties properties = System.getProperties();
    properties.list(System.out);
  }
}
