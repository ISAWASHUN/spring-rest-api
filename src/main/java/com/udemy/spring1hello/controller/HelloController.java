package com.udemy.spring1hello.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
  @GetMapping(value = "/")
  public String index() {
    return "Hello World!";
  }

  @GetMapping(value = "/hello")
  public String hello() {
    return "Hello World!";
  }
  
}
