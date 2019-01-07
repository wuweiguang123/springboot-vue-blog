package com.xgsxd.blog.controller;

import com.xgsxd.blog.bean.User;
import com.xgsxd.blog.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.ResponseWrapper;

@Controller
@RequestMapping("/")
public class LoginController {

    @Resource
    private IUserService userService;


    /**
     * 进入登录页面
     * @return
     */
    @RequestMapping("login")
    public String login(){

        return  "login";
    }

    /**
     * 执行登录操作
     * @param request
     * @return
     */
    @RequestMapping(value = "doLogin",method = RequestMethod.POST)
    public String doLogin(Model model, HttpServletRequest request){
        String userAccount  = request.getParameter("userAccount");
        String userPassword = request.getParameter("userPassword");
        User user = userService.queryUserByUserAccountAndUserPwd(userAccount, userPassword);
        if(user != null){
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            model.addAttribute("userInfo", user);
            return "index";
        }else{
            model.addAttribute("messageInfo", "用户名或密码错误");
            return "login";
        }

    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate(); //清空session

        return "login";
    }

}
