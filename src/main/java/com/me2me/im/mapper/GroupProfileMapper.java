package com.me2me.im.mapper;

import com.me2me.im.model.GroupProfile;
import com.me2me.im.model.GroupProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupProfileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_profile
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    int countByExample(GroupProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_profile
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    int deleteByExample(GroupProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_profile
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_profile
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    int insert(GroupProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_profile
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    int insertSelective(GroupProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_profile
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    List<GroupProfile> selectByExample(GroupProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_profile
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    GroupProfile selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_profile
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    int updateByExampleSelective(@Param("record") GroupProfile record, @Param("example") GroupProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_profile
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    int updateByExample(@Param("record") GroupProfile record, @Param("example") GroupProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_profile
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    int updateByPrimaryKeySelective(GroupProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_profile
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    int updateByPrimaryKey(GroupProfile record);
}