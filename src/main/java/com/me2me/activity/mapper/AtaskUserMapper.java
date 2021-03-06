package com.me2me.activity.mapper;

import com.me2me.activity.model.AtaskUser;
import com.me2me.activity.model.AtaskUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AtaskUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task_user
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    int countByExample(AtaskUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task_user
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    int deleteByExample(AtaskUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task_user
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task_user
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    int insert(AtaskUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task_user
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    int insertSelective(AtaskUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task_user
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    List<AtaskUser> selectByExample(AtaskUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task_user
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    AtaskUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task_user
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    int updateByExampleSelective(@Param("record") AtaskUser record, @Param("example") AtaskUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task_user
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    int updateByExample(@Param("record") AtaskUser record, @Param("example") AtaskUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task_user
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    int updateByPrimaryKeySelective(AtaskUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task_user
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    int updateByPrimaryKey(AtaskUser record);
}