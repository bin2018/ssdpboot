package com.service.impl;

import com.dao.DemandDao;
import com.dao.PacteraPlatformGroupMapper;
import com.entity.PacteraPlatformGroup;
import com.service.PacteraPlatformGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by pact on 2019/1/3.
 */
@Service
public class PacteraPlatformGroupServiceImpl implements PacteraPlatformGroupService {
    @Resource
    private PacteraPlatformGroupMapper ppGroupMapper;
    @Override
    public int insert(PacteraPlatformGroup pacteraPlatformGroup) {
        return ppGroupMapper.insert(pacteraPlatformGroup);
    }
}
