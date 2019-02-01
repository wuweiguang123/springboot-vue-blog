package com.xgsxd.blog.service.impl;

import com.xgsxd.blog.bean.User;
import com.xgsxd.blog.dao.UserMapper;
import com.xgsxd.blog.service.IUserService;
import com.xgsxd.utils.Consant;
import com.xgsxd.utils.Page;
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
    public Page selectUserList(User user, Integer currentPage, Integer pageSize) {
        Integer rows = userMapper.countUsers(user); //查询总条数

        Page page = new Page(pageSize,currentPage, rows);
        user.setStart(page.getStart());
        user.setLength(page.getPageSize());
        List<User> userList = userMapper.selectUserList(user);
        if (userList != null){
            page.setPageData(userList);
        }

        return page;
    }

    @Override
    public Integer countUsers(User user) {

        return userMapper.countUsers(user);
    }

    @Override
    public int insert(User record) {
        int flag=userMapper.insert(record);
        if (flag>0){
            return flag;
        }else {

            return 0;
        }


    }
}
