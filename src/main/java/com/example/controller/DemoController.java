package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/demo/api")
public class DemoController {
      @GetMapping("welcome")
      public String welcome() {
          return "welcome to application";
      }
      
      @GetMapping("/hello")
      public String hello() {
    	  return "hello ";
    }
      
      @GetMapping("greet")
      public String greet() {
          return "greeting to application";
      }
      }
