package com.xgsxd.blog.controller;

import com.xgsxd.blog.bean.User;
import com.xgsxd.blog.service.IUserService;
import com.xgsxd.utils.JSONResult;
import com.xgsxd.utils.Page;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/admin/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/list")
    public String userList(){

        return "user";
    }

    @ResponseBody
    @RequestMapping("/queryUsers")
    public JSONResult queryUsers(@RequestBody String params){
        JSONResult jsonResult = new JSONResult();
        if (!StringUtils.isEmpty(params)){
            JSONObject jsonObject = new JSONObject(params);
            String userName = jsonObject.getString("userName");
            Integer currentPage = jsonObject.getInt("currentPage");
            Integer pageSize = jsonObject.getInt("pageSize");

            User user = new User();
            user.setUserName(userName);
            Page page = userService.selectUserList(user, currentPage, pageSize);

            jsonResult.setData(page);
            jsonResult.setStatus("success");
        } else{

            jsonResult.setMessage("Exception：服务器异常请确认后重试");
            jsonResult.setStatus("fail");
        }

        return jsonResult;
    }
}
