package com.xgsxd.blog.service;

import com.xgsxd.blog.bean.User;

public interface IUserService {

    User queryUserByUserAccountAndUserPwd(String userAccount,String userPassword);
}
