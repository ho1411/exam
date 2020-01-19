package com.tgh.exam.controller;


import com.tgh.exam.domain.UserTest;
import com.tgh.exam.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(value = "/getAllUser")
    public List<UserTest> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping(value = "/insert")
    public void insert(@Param("id") int id,
                       @Param("username") String username,
                       @Param("age") String age,
                       @Param("sex") String sex) {
        UserTest userTest = new UserTest();
        userTest.setId(id);
        userTest.setUserName(username);
        userTest.setAge(age);
        userTest.setSex(sex);
        userService.insert(userTest);
    }
}
