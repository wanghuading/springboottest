package com.sz.springboottest.autoconfiguration;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("java7")
public class CountInJava7 implements Count {
  @Override
  public int sum(Integer... nums) {
    System.out.println("java7 count");
    Integer sum = 0;
    for (Integer n : nums) {
      sum += n;
    }
    return sum;
  }
}
