package com.me2me.user.model;

import java.util.Date;

import com.me2me.common.web.BaseEntity;

public class UserSeekFollow implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_seek_follow.id
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_seek_follow.uid
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_seek_follow.create_time
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_seek_follow.id
     *
     * @return the value of user_seek_follow.id
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_seek_follow.id
     *
     * @param id the value for user_seek_follow.id
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_seek_follow.uid
     *
     * @return the value of user_seek_follow.uid
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_seek_follow.uid
     *
     * @param uid the value for user_seek_follow.uid
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_seek_follow.create_time
     *
     * @return the value of user_seek_follow.create_time
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_seek_follow.create_time
     *
     * @param createTime the value for user_seek_follow.create_time
     *
     * @mbggenerated Sat Apr 22 13:54:59 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}