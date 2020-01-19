package com.tgh.exam.controller;


import com.tgh.exam.domain.UserTest;
import com.tgh.exam.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/exam")
public class IndexController {

    @GetMapping("index")
    public String index() {
        return "index.html";
    }

}
