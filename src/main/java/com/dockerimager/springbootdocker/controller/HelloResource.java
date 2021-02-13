package com.dockerimager.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naveen Bavu
 */
@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {

  @GetMapping
  public String get() {
    return "Hello World1";
  }


}
