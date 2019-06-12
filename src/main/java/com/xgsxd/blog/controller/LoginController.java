package com.xgsxd.blog.controller;

import com.xgsxd.blog.bean.User;
import com.xgsxd.blog.service.IUserService;
import com.xgsxd.utils.JSONResult;
import com.xgsxd.utils.ResultCode;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/")
public class LoginController {

    @Resource
    private IUserService userService;


    /**
     * 执行登录操作
     * @param params
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public JSONResult doLogin(@RequestBody String params, HttpServletRequest request){
        JSONResult jsonResult = new JSONResult();
        if (StringUtils.isNotBlank(params)){
            JSONObject jsonObject = new JSONObject(params);
            String userAccount  = jsonObject.getString("userAccount");
            String userPassword = jsonObject.getString("userPassword");
            if (userAccount != null &&userPassword!= null){
                User user = userService.queryUserByUserAccountAndUserPwd(userAccount, userPassword);
                if(user != null) {
                    HttpSession session = request.getSession();

                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

                    session.setAttribute("loginTime", sdf.format(date));
                    session.setAttribute("userInfo", user);
                }
                jsonResult.setMessage("登录成功");
                jsonResult.setStatusCode(200);
            }
        } else {

            jsonResult.setMessage("参数不可以为空");
        }

        return jsonResult;

    }

}
