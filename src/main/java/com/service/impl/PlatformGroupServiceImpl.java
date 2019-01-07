package com.service.impl;

import com.dao.GroupMapper;
import com.entity.PlatformGroup;
import com.service.PlatformGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by pact on 2019/1/3.
 */
@Service
public class PlatformGroupServiceImpl implements PlatformGroupService {
    @Resource
    private GroupMapper ppGroupMapper;
    @Override
    public int insert(PlatformGroup pacteraPlatformGroup) {
        return ppGroupMapper.insert(pacteraPlatformGroup);
    }
}
