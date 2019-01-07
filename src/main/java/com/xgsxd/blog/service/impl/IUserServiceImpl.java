package com.xgsxd.blog.service.impl;

import com.xgsxd.blog.bean.User;
import com.xgsxd.blog.dao.UserMapper;
import com.xgsxd.blog.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IUserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryUserByUserAccountAndUserPwd(String userAccount, String userPassword) {

        User user = userMapper.queryUserByUserAccountAndUserPwd(userAccount, userPassword);

        return user;
    }
}
