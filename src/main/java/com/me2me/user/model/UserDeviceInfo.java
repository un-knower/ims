package com.me2me.user.model;

import java.util.Date;

import com.me2me.common.web.BaseEntity;

public class UserDeviceInfo implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device_info.id
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device_info.uid
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device_info.device_code
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    private String deviceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device_info.mobile_model
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    private String mobileModel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device_info.system_version
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    private String systemVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device_info.ip
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device_info.create_time
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device_info.type
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    private Integer type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device_info.id
     *
     * @return the value of user_device_info.id
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device_info.id
     *
     * @param id the value for user_device_info.id
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device_info.uid
     *
     * @return the value of user_device_info.uid
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device_info.uid
     *
     * @param uid the value for user_device_info.uid
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device_info.device_code
     *
     * @return the value of user_device_info.device_code
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device_info.device_code
     *
     * @param deviceCode the value for user_device_info.device_code
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode == null ? null : deviceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device_info.mobile_model
     *
     * @return the value of user_device_info.mobile_model
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public String getMobileModel() {
        return mobileModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device_info.mobile_model
     *
     * @param mobileModel the value for user_device_info.mobile_model
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel == null ? null : mobileModel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device_info.system_version
     *
     * @return the value of user_device_info.system_version
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public String getSystemVersion() {
        return systemVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device_info.system_version
     *
     * @param systemVersion the value for user_device_info.system_version
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion == null ? null : systemVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device_info.ip
     *
     * @return the value of user_device_info.ip
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device_info.ip
     *
     * @param ip the value for user_device_info.ip
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device_info.create_time
     *
     * @return the value of user_device_info.create_time
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device_info.create_time
     *
     * @param createTime the value for user_device_info.create_time
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device_info.type
     *
     * @return the value of user_device_info.type
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device_info.type
     *
     * @param type the value for user_device_info.type
     *
     * @mbggenerated Mon Sep 11 14:51:00 CST 2017
     */
    public void setType(Integer type) {
        this.type = type;
    }
}