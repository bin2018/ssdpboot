package com.service.impl;

import com.dao.PacteraDemandMapper;
import com.dao.PacteraPlatformGroupMapper;
import com.dao.PacteraUserMapper;
import com.entity.PacteraDemand;
import com.entity.PacteraPlatformGroup;
import com.entity.PacteraUser;
import com.service.PacteraDemandService;
import com.service.PacteraPlatformGroupService;
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
public class PacteraDemandServiceImpl implements PacteraDemandService {
    @Resource
    private PacteraDemandMapper demandMapper;

    @Override
    public int insert(PacteraDemand demand) {
        return demandMapper.insert(demand);
    }

    @Override
    public List<PacteraDemand> selectAll(Map map) {
        return null;
    }
}
