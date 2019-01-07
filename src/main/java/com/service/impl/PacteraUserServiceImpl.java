package com.service.impl;

import com.dao.PacteraUserMapper;
import com.entity.PacteraDemand;
import com.entity.PacteraUser;
import com.service.PacteraDemandService;
import com.service.PacteraUserService;
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
public class PacteraUserServiceImpl implements PacteraUserService {
    @Resource
    private PacteraUserMapper pUserMapper;

    @Override
    public int insert(PacteraUser pacteraUser) {
        return pUserMapper.insert(pacteraUser);
    }

    @Override
    public Page<PacteraUser> selectUser(Page<PacteraUser> pageUser ) {
        Page<PacteraUser> page  = new Page<PacteraUser>();
        PacteraUser pUser =  pageUser.getQuery();
        Long count = pUserMapper.selectUserCount(pUser);
        Map  map = new HashMap<>();
        map.put("platformGroupCode",pageUser.getQuery().getPlatformGroupCode());
        Integer startSize = (pageUser.getCurrentPage()-1)*pageUser.getSize();
        map.put("startSize",startSize);
        map.put("size",pageUser.getSize());
        List <PacteraUser> userList = pUserMapper.selectUser(map);

        //存数据到page
        page.setCount(count);
        page.setResult(userList);
        page.setCurrentPage(pageUser.getCurrentPage());
        page.setSize(pageUser.getSize());
        return page;
    }

    public int updateUser(PacteraUser record) {
        return pUserMapper.updateUser(record);
    }

    public int deleteUser(PacteraUser user) {
        return pUserMapper.deleteUser(user);
    }

    public int login(PacteraUser user) {
        return pUserMapper.login(user);
    }



    public List<PacteraDemand> selectAll(Map map) {
        return null;
    }
}
