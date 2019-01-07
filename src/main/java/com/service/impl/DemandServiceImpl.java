package com.service.impl;

import com.dao.DemandMapper;
import com.entity.Demand;
import com.service.DemandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by pact on 2019/1/6.
 */
@Service
public class DemandServiceImpl implements DemandService {
    @Resource
    private DemandMapper demandMapper;
    @Override
    public int insert(Demand demand) {
        return demandMapper.insert(demand);
    }

    @Override
    public int update(Demand demand) {
        return demandMapper.update(demand);
    }

    @Override
    public int delete(Demand demand) {
        return demandMapper.update(demand);
    }
}
