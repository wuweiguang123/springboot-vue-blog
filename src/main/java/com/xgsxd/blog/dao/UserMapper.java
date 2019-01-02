package com.xgsxd.blog.dao;

import com.xgsxd.blog.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User queryUserByUserAccountAndUserPwd(@Param("userAccount")String userAccount, @Param("userPassword")String userPassword);
}