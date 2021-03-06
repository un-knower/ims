package com.me2me.ims.mapper.auto;

import com.me2me.ims.model.ImsUserLog;
import com.me2me.ims.model.ImsUserLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImsUserLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_user_log
     *
     * @mbggenerated Wed Nov 22 09:43:38 CST 2017
     */
    int countByExample(ImsUserLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_user_log
     *
     * @mbggenerated Wed Nov 22 09:43:38 CST 2017
     */
    int deleteByExample(ImsUserLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_user_log
     *
     * @mbggenerated Wed Nov 22 09:43:38 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_user_log
     *
     * @mbggenerated Wed Nov 22 09:43:38 CST 2017
     */
    int insert(ImsUserLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_user_log
     *
     * @mbggenerated Wed Nov 22 09:43:38 CST 2017
     */
    int insertSelective(ImsUserLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_user_log
     *
     * @mbggenerated Wed Nov 22 09:43:38 CST 2017
     */
    List<ImsUserLog> selectByExample(ImsUserLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_user_log
     *
     * @mbggenerated Wed Nov 22 09:43:38 CST 2017
     */
    ImsUserLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_user_log
     *
     * @mbggenerated Wed Nov 22 09:43:38 CST 2017
     */
    int updateByExampleSelective(@Param("record") ImsUserLog record, @Param("example") ImsUserLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_user_log
     *
     * @mbggenerated Wed Nov 22 09:43:38 CST 2017
     */
    int updateByExample(@Param("record") ImsUserLog record, @Param("example") ImsUserLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_user_log
     *
     * @mbggenerated Wed Nov 22 09:43:38 CST 2017
     */
    int updateByPrimaryKeySelective(ImsUserLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_user_log
     *
     * @mbggenerated Wed Nov 22 09:43:38 CST 2017
     */
    int updateByPrimaryKey(ImsUserLog record);
}