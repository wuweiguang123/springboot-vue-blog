package com.xgsxd.blog.service.impl;

import com.xgsxd.blog.bean.User;
import com.xgsxd.blog.dao.UserMapper;
import com.xgsxd.blog.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryUserByUserAccountAndUserPwd(String userAccount, String userPassword) {

        User user = userMapper.queryUserByUserAccountAndUserPwd(userAccount, userPassword);

        return user;
    }

    @Override
    public List<User> selectUserList(User user, Integer currentPage, Integer pageSize) {
        Integer rows = userMapper.countUsers(user);


        return null;
    }

    @Override
    public Integer countUsers(User user) {
        return null;
    }
}
