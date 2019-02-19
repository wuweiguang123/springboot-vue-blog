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

    /**
     * 查询用户列表
     *
     * @param user
     * @param currentPage
     * @param pageSize
     * @param model
     * @return
     */
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

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
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

    /**
     * 添加用户
     *
     * @param user
     * @param model
     * @return
     */
     @RequestMapping("/add")
     public String addUser(User  user, Model model){
        int flag = userService.insert(user);

        if (flag>0){
            model.addAttribute("message","添加成功");
        }else{
            model.addAttribute("message","添加失败");
        }

        return "redirect:/admin/user/list";
     }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
     @RequestMapping("/delete")
     public String deleteUser(Integer id){
        userService.updateUserStatusByUserId(id);

        return "redirect:/admin/user/list";
     }

     @RequestMapping("/update")
     public String updateUser(User user, Model model){
        int flag = userService.updateUser(user);

         if (flag>0){
             model.addAttribute("message","修改成功");
         }else{
             model.addAttribute("message","修改失败");
         }

        return "redirect:/admin/user/list";
     }

}
