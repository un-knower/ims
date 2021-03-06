package com.me2me.activity.mapper;

import com.me2me.activity.model.Atask;
import com.me2me.activity.model.AtaskExample;
import com.me2me.activity.model.AtaskWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AtaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    int countByExample(AtaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    int deleteByExample(AtaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    int insert(AtaskWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    int insertSelective(AtaskWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    List<AtaskWithBLOBs> selectByExampleWithBLOBs(AtaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    List<Atask> selectByExample(AtaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    AtaskWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    int updateByExampleSelective(@Param("record") AtaskWithBLOBs record, @Param("example") AtaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") AtaskWithBLOBs record, @Param("example") AtaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    int updateByExample(@Param("record") Atask record, @Param("example") AtaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    int updateByPrimaryKeySelective(AtaskWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(AtaskWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_task
     *
     * @mbggenerated Wed Dec 28 21:04:28 CST 2016
     */
    int updateByPrimaryKey(Atask record);
}