package com.dao;

import com.entity.PlatformGroup;

public interface GroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pactera_platform_group
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pactera_platform_group
     *
     * @mbggenerated
     */
    int insert(PlatformGroup pacteraPlatformGroup);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pactera_platform_group
     *
     * @mbggenerated
     */
    int insertSelective(PlatformGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pactera_platform_group
     *
     * @mbggenerated
     */
    PlatformGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pactera_platform_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PlatformGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pactera_platform_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PlatformGroup record);
}