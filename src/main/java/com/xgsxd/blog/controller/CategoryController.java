package com.xgsxd.blog.controller;

import com.xgsxd.blog.bean.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {

    @GetMapping("/list")
    public String catagoryList(){

        return "category";
    }

    @PostMapping("/add")
    public String add(Category category, Model model){

        return "category";
    }

}
