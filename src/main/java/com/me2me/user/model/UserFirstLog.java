package com.me2me.user.model;

import java.util.Date;

import com.me2me.common.web.BaseEntity;

public class UserFirstLog implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_first_log.id
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_first_log.uid
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_first_log.action_type
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    private Integer actionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_first_log.create_time
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_first_log.id
     *
     * @return the value of user_first_log.id
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_first_log.id
     *
     * @param id the value for user_first_log.id
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_first_log.uid
     *
     * @return the value of user_first_log.uid
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_first_log.uid
     *
     * @param uid the value for user_first_log.uid
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_first_log.action_type
     *
     * @return the value of user_first_log.action_type
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    public Integer getActionType() {
        return actionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_first_log.action_type
     *
     * @param actionType the value for user_first_log.action_type
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_first_log.create_time
     *
     * @return the value of user_first_log.create_time
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_first_log.create_time
     *
     * @param createTime the value for user_first_log.create_time
     *
     * @mbggenerated Tue Jul 25 10:59:49 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}