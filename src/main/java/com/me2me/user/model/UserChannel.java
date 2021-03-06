package com.me2me.user.model;

import com.me2me.common.web.BaseEntity;

public class UserChannel implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_channel.id
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_channel.uid
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_channel.channel_no
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    private Integer channelNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_channel.id
     *
     * @return the value of user_channel.id
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_channel.id
     *
     * @param id the value for user_channel.id
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_channel.uid
     *
     * @return the value of user_channel.uid
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_channel.uid
     *
     * @param uid the value for user_channel.uid
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_channel.channel_no
     *
     * @return the value of user_channel.channel_no
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public Integer getChannelNo() {
        return channelNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_channel.channel_no
     *
     * @param channelNo the value for user_channel.channel_no
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public void setChannelNo(Integer channelNo) {
        this.channelNo = channelNo;
    }
}