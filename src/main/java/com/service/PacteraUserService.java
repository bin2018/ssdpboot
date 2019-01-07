package com.service;

import com.entity.PacteraPlatformGroup;
import com.entity.PacteraUser;
import com.tools.Page;

import java.util.List;

/**
 * Created by pact on 2019/1/3.
 */
public interface PacteraUserService {
    int insert(PacteraUser pacteraUser);
    Page<PacteraUser> selectUser(Page<PacteraUser> pageUser);
    int updateUser(PacteraUser user);
    int deleteUser(PacteraUser user);
    int login(PacteraUser user);
}
