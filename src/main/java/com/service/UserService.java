package com.service;

import com.entity.User;
import com.tools.Page;

/**
 * Created by pact on 2019/1/3.
 */
public interface UserService {
    int insert(User pacteraUser);
    Page<User> selectUser(Page<User> pageUser);
    int updateUser(User user);
    int deleteUser(User user);
    int login(User user);
}
