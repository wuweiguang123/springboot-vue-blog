package com.xgsxd.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @RequestMapping("/catagoryList")
    public String catagoryList(){

        return "category";
    }

    @RequestMapping("/queryCatagory") //标签
    public String selectCategoryAndTags(){

        return "category";
    }
}
