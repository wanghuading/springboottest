package com.sz.springboottest.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ribbon-server")
public interface PersonService {
  @GetMapping("/person/findAll")
  String findAll();
}
