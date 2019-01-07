package com.xgsxd.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @RequestMapping("/category_tagsList")
    public String selectCategoryAndTags(){

        return "category_tags";
    }
}
