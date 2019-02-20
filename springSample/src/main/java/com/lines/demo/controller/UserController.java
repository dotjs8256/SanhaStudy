package com.lines.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lines.demo.biz.UserHandler;

@RestController
public class UserController {
  
  @Autowired
  UserHandler userHandler;
  
  @GetMapping("/UserList")
  public Object selectUserList() {
    return userHandler.getUserList();
  }

}   