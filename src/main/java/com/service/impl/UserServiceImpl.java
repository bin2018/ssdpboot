package com.service.impl;

import com.dao.UserMapper;
import com.entity.User;
import com.service.UserService;
import com.tools.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pact on 2019/1/3.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper pUserMapper;

    @Override
    public int insert(User pacteraUser) {
        return pUserMapper.insert(pacteraUser);
    }

    @Override
    public Page<User> selectUser(Page<User> pageUser ) {
        Page<User> page  = new Page<User>();
        User pUser =  pageUser.getQuery();
        Long count = pUserMapper.selectUserCount(pUser);
        Map  map = new HashMap<>();
        map.put("platformGroupCode",pageUser.getQuery().getPlatformGroupCode());
        Integer startSize = (pageUser.getCurrentPage()-1)*pageUser.getSize();
        map.put("startSize",startSize);
        map.put("size",pageUser.getSize());
        List <User> userList = pUserMapper.selectUser(map);

        //存数据到page
        page.setCount(count);
        page.setResult(userList);
        page.setCurrentPage(pageUser.getCurrentPage());
        page.setSize(pageUser.getSize());
        return page;
    }

    public int updateUser(User record) {
        return pUserMapper.updateUser(record);
    }

    public int deleteUser(User user) {
        return pUserMapper.deleteUser(user);
    }

    public int login(User user) {
        return pUserMapper.login(user);
    }




}
