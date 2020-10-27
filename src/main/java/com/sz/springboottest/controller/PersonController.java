package com.sz.springboottest.controller;

import com.sz.springboottest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class PersonController implements PersonService {

  private final PersonService personService;

  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  @Override
  public String findAll() {
    return personService.findAll();
  }

}
