package com.alex.springcloud.controller;

import com.alex.springcloud.Config.UserConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/user")
public class UserController {

  private UserConfig userConfig;

  public UserController(UserConfig userConfig) {
    this.userConfig = userConfig;
  }

  @GetMapping("/type")
  public String GetUserType(){
    System.out.println("userConfig = " + userConfig);
    System.out.println("userConfig = " + userConfig.getType());

    return this.userConfig.getType();
  }
}
