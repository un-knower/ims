package com.me2me.live.mapper;

import com.me2me.live.model.DeleteLog;
import com.me2me.live.model.DeleteLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeleteLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delete_log
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int countByExample(DeleteLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delete_log
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int deleteByExample(DeleteLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delete_log
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delete_log
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int insert(DeleteLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delete_log
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int insertSelective(DeleteLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delete_log
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    List<DeleteLog> selectByExample(DeleteLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delete_log
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    DeleteLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delete_log
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int updateByExampleSelective(@Param("record") DeleteLog record, @Param("example") DeleteLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delete_log
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int updateByExample(@Param("record") DeleteLog record, @Param("example") DeleteLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delete_log
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int updateByPrimaryKeySelective(DeleteLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delete_log
     *
     * @mbggenerated Mon Sep 26 16:32:06 CST 2016
     */
    int updateByPrimaryKey(DeleteLog record);
}