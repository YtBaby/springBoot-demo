package com.example.mine.web;

import com.example.mine.domain.User;
import com.example.mine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findByNameAndPwd", method = RequestMethod.GET)
    public User findByNameAndPwd(@RequestParam("name") String name, @RequestParam("pwd") String pwd){
        return userService.findByNameAndPwd(name,pwd);
    }
}
