package com.xgsxd.blog.controller;

import com.xgsxd.blog.bean.User;
import com.xgsxd.blog.service.IUserService;
import com.xgsxd.utils.Consant;
import com.xgsxd.utils.JSONResult;
import com.xgsxd.utils.Page;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @ResponseBody
    @RequestMapping(value = "/findUserById", method = RequestMethod.POST)
    public JSONResult findUserById(Integer id){
        JSONResult jsonResult = new JSONResult();


        User user = userService.findUserByUserId(id);
        if (user != null){
            jsonResult.setStatus("success");
            jsonResult.setData(user);
            jsonResult.setMessage("请求成功");
        } else{
            jsonResult.setStatus("fail");
            jsonResult.setMessage("请求数据错误");
        }

        return jsonResult;
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
