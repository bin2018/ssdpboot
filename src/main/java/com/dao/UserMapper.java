package com.dao;

import com.entity.User;
import com.tools.Page;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    int insert(User user);
    List<User> selectUser(Map map);
    Long selectUserCount(User user);
    int updateUser(User record);
    int deleteUser(User record);
    int login(User user);
    int deleteByPrimaryKey(Integer userid);




}