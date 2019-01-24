package com.xgsxd.blog.service;

import com.xgsxd.blog.bean.User;

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
    List<User> selectUserList(User user, Integer currentPage, Integer pageSize);

    /**
     * 根据条件查询有多少个用户
     * （根据数量进行分页显示）
     *
     * @param user 查询条件
     * @return 用户数量
     */
    Integer countUsers(User user);

}
