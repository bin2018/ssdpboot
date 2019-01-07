package com.dao;

import com.entity.PacteraDemand;

import java.util.List;
import java.util.Map;

public interface PacteraDemandMapper {



    int insert(PacteraDemand record);
    List<PacteraDemand> selectAll(Map map);

    int deleteByPrimaryKey(Long id);
    int insertSelective(PacteraDemand record);
    int updateByPrimaryKeySelective(PacteraDemand record);

    int updateByPrimaryKey(PacteraDemand record);
}