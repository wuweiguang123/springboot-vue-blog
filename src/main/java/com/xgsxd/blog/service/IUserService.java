package com.xgsxd.blog.service;

import com.xgsxd.blog.bean.User;
import com.xgsxd.utils.Page;

import java.util.List;

public interface IUserService {


    /**
     * 根据用户名密码查询
     *
     * @param userAccount
     * @param userPassword
     * @return
     */
    User queryUserByUserAccountAndUserPwd(String userAccount,String userPassword);

    /**
     * 根据分页条件查询用户信息
     *
     * @param user 查询条件
     * @param currentPage 当前页
     * @param pageSize 每页大小
     * @return
     */
    Page selectUserList(User user, Integer currentPage, Integer pageSize);

    /**
     * 根据id查询
     * @param userId
     * @return
     */
    User findUserByUserId(Integer userId);

    /**
     * 根据条件查询有多少个用户
     * （根据数量进行分页显示）
     *
     * @param user 查询条件
     * @return 用户数量
     */
    Integer countUsers(User user);

    /**
     * 用户添加
     * @param record
     * @return
     */
    int insert(User record);


}
