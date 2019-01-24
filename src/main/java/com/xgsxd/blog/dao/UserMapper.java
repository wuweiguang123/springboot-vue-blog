package com.xgsxd.blog.dao;

import com.xgsxd.blog.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User queryUserByUserAccountAndUserPwd(@Param("userAccount")String userAccount, @Param("userPassword")String userPassword);

    /**
     * 根据分页条件查询用户信息
     *
     * @param user  查询条件
     * @return 返回多条用户信息
     */
    List<User> selectUserList(User user);

    /**
     * 根据条件查询有多少个用户
     * （根据数量进行分页显示）
     *
     * @param user 查询条件
     * @return 用户数量
     */
    Integer countUsers(User user);
}