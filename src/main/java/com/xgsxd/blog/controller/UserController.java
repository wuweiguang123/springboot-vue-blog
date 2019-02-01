package com.xgsxd.blog.controller;

import com.xgsxd.blog.bean.User;
import com.xgsxd.blog.service.IUserService;
import com.xgsxd.utils.Consant;
import com.xgsxd.utils.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/admin/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/list")
    public String queryUsers(User user,Integer currentPage, Integer pageSize, Model model){
        if (currentPage == null){
            currentPage = 1;
        }
        if (pageSize == null){
            pageSize = Consant.PAGE_SIZE;
        }
        Page page = userService.selectUserList(user,currentPage, pageSize);

        model.addAttribute("page",page);

        return "manage-user";
    }

    @RequestMapping("/add")
     public String addUser(User  user, Model model){
        int flag = userService.insert(user);

        if (flag>0){
            model.addAttribute("message","添加成功");
        }else{
            model.addAttribute("message","添加成功");
        }

        return "redirect:/admin/user/list";
     }

}
