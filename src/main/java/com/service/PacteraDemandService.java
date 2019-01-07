package com.service;

import com.entity.PacteraDemand;
import com.entity.PacteraUser;
import com.tools.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by pact on 2019/1/3.
 */
public interface PacteraDemandService {
    int insert(PacteraDemand demand);
    List<PacteraDemand> selectAll(Map map);

}
