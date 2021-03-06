package com.me2me.user.mapper;

import com.me2me.user.model.UserAvatarFrame;
import com.me2me.user.model.UserAvatarFrameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAvatarFrameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar_frame
     *
     * @mbggenerated Thu Aug 31 21:19:56 CST 2017
     */
    int countByExample(UserAvatarFrameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar_frame
     *
     * @mbggenerated Thu Aug 31 21:19:56 CST 2017
     */
    int deleteByExample(UserAvatarFrameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar_frame
     *
     * @mbggenerated Thu Aug 31 21:19:56 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar_frame
     *
     * @mbggenerated Thu Aug 31 21:19:56 CST 2017
     */
    int insert(UserAvatarFrame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar_frame
     *
     * @mbggenerated Thu Aug 31 21:19:56 CST 2017
     */
    int insertSelective(UserAvatarFrame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar_frame
     *
     * @mbggenerated Thu Aug 31 21:19:56 CST 2017
     */
    List<UserAvatarFrame> selectByExample(UserAvatarFrameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar_frame
     *
     * @mbggenerated Thu Aug 31 21:19:56 CST 2017
     */
    UserAvatarFrame selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar_frame
     *
     * @mbggenerated Thu Aug 31 21:19:56 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserAvatarFrame record, @Param("example") UserAvatarFrameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar_frame
     *
     * @mbggenerated Thu Aug 31 21:19:56 CST 2017
     */
    int updateByExample(@Param("record") UserAvatarFrame record, @Param("example") UserAvatarFrameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar_frame
     *
     * @mbggenerated Thu Aug 31 21:19:56 CST 2017
     */
    int updateByPrimaryKeySelective(UserAvatarFrame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_avatar_frame
     *
     * @mbggenerated Thu Aug 31 21:19:56 CST 2017
     */
    int updateByPrimaryKey(UserAvatarFrame record);
}