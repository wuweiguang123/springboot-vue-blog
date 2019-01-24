package com.xgsxd.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/user")
public class UserController {



    @RequestMapping("/userList")
    public String userList(){

        return "user";
    }

    @RequestMapping("/queryUsers")
    public String queryUsers(){

        return "user";
    }
}
