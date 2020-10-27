package com.sz.springboottest.autoconfiguration;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Profile("java8")
public class CountInJava8 implements Count {
  @Override
  public int sum(Integer... nums) {
    System.out.println("java8 count");
    return Arrays.stream(nums).reduce(0, Integer::sum);
  }
}
