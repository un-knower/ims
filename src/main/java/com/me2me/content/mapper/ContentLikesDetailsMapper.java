package com.me2me.content.mapper;

import com.me2me.content.model.ContentLikesDetails;
import com.me2me.content.model.ContentLikesDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentLikesDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_likes_details
     *
     * @mbggenerated Tue May 10 17:26:05 CST 2016
     */
    int countByExample(ContentLikesDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_likes_details
     *
     * @mbggenerated Tue May 10 17:26:05 CST 2016
     */
    int deleteByExample(ContentLikesDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_likes_details
     *
     * @mbggenerated Tue May 10 17:26:05 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_likes_details
     *
     * @mbggenerated Tue May 10 17:26:05 CST 2016
     */
    int insert(ContentLikesDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_likes_details
     *
     * @mbggenerated Tue May 10 17:26:05 CST 2016
     */
    int insertSelective(ContentLikesDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_likes_details
     *
     * @mbggenerated Tue May 10 17:26:05 CST 2016
     */
    List<ContentLikesDetails> selectByExample(ContentLikesDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_likes_details
     *
     * @mbggenerated Tue May 10 17:26:05 CST 2016
     */
    ContentLikesDetails selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_likes_details
     *
     * @mbggenerated Tue May 10 17:26:05 CST 2016
     */
    int updateByExampleSelective(@Param("record") ContentLikesDetails record, @Param("example") ContentLikesDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_likes_details
     *
     * @mbggenerated Tue May 10 17:26:05 CST 2016
     */
    int updateByExample(@Param("record") ContentLikesDetails record, @Param("example") ContentLikesDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_likes_details
     *
     * @mbggenerated Tue May 10 17:26:05 CST 2016
     */
    int updateByPrimaryKeySelective(ContentLikesDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_likes_details
     *
     * @mbggenerated Tue May 10 17:26:05 CST 2016
     */
    int updateByPrimaryKey(ContentLikesDetails record);
}