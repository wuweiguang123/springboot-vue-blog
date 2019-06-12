package com.xgsxd.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/article")
public class ArticleController {


    @RequestMapping("/list")
    public String selectArticesList(){

        return "articles";
    }
}
