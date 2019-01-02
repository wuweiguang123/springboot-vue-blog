package com.xgsxd.blog.service.impl;

import com.xgsxd.blog.bean.User;
import com.xgsxd.blog.dao.UserMapper;
import com.xgsxd.blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByUserAccountAndUserPwd(String userAccount, String userPassword) {

        User user = userMapper.queryUserByUserAccountAndUserPwd(userAccount, userPassword);


        return null;
    }
}
