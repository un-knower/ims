package com.me2me.search.mapper;

import com.me2me.search.model.SearchHistoryCount;
import com.me2me.search.model.SearchHistoryCountExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

public interface SearchHistoryCountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_history_count
     *
     * @mbggenerated Wed Apr 05 11:41:54 CST 2017
     */
    int countByExample(SearchHistoryCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_history_count
     *
     * @mbggenerated Wed Apr 05 11:41:54 CST 2017
     */
    int deleteByExample(SearchHistoryCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_history_count
     *
     * @mbggenerated Wed Apr 05 11:41:54 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_history_count
     *
     * @mbggenerated Wed Apr 05 11:41:54 CST 2017
     */
    int insert(SearchHistoryCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_history_count
     *
     * @mbggenerated Wed Apr 05 11:41:54 CST 2017
     */
    int insertSelective(SearchHistoryCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_history_count
     *
     * @mbggenerated Wed Apr 05 11:41:54 CST 2017
     */
    List<SearchHistoryCount> selectByExample(SearchHistoryCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_history_count
     *
     * @mbggenerated Wed Apr 05 11:41:54 CST 2017
     */
    SearchHistoryCount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_history_count
     *
     * @mbggenerated Wed Apr 05 11:41:54 CST 2017
     */
    int updateByExampleSelective(@Param("record") SearchHistoryCount record, @Param("example") SearchHistoryCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_history_count
     *
     * @mbggenerated Wed Apr 05 11:41:54 CST 2017
     */
    int updateByExample(@Param("record") SearchHistoryCount record, @Param("example") SearchHistoryCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_history_count
     *
     * @mbggenerated Wed Apr 05 11:41:54 CST 2017
     */
    int updateByPrimaryKeySelective(SearchHistoryCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_history_count
     *
     * @mbggenerated Wed Apr 05 11:41:54 CST 2017
     */
    int updateByPrimaryKey(SearchHistoryCount record);
}