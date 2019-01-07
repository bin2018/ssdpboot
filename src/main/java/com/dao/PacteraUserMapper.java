package com.dao;

import com.entity.PacteraUser;
import com.tools.Page;

import java.util.List;
import java.util.Map;

public interface PacteraUserMapper {

    int insert(PacteraUser pacteraUser);
    List<PacteraUser> selectUser(Map map);
    Long selectUserCount(PacteraUser pacteraUser);
    int updateUser(PacteraUser record);
    int deleteUser(PacteraUser record);
    int login(PacteraUser user);


    int deleteByPrimaryKey(Integer userid);




    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pactera_user
     *
     * @mbggenerated
     */
    int insertSelective(PacteraUser record);




    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pactera_user
     *
     * @mbggenerated
     */

}