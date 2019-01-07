package com.service;

import com.entity.Demand;

/**
 * Created by pact on 2019/1/6.
 */
public interface DemandService {
    int insert(Demand demand);
    int update(Demand demand);
    int delete(Demand demand);

}
