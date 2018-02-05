package com.me2me.user.model;

import com.me2me.common.web.BaseEntity;

public class UserDevice implements BaseEntity{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device.id
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device.uid
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device.os
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    private String os;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device.platform
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    private Integer platform;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_device.device_no
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    private String deviceNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device.id
     *
     * @return the value of user_device.id
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device.id
     *
     * @param id the value for user_device.id
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device.uid
     *
     * @return the value of user_device.uid
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device.uid
     *
     * @param uid the value for user_device.uid
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device.os
     *
     * @return the value of user_device.os
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    public String getOs() {
        return os;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device.os
     *
     * @param os the value for user_device.os
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device.platform
     *
     * @return the value of user_device.platform
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device.platform
     *
     * @param platform the value for user_device.platform
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_device.device_no
     *
     * @return the value of user_device.device_no
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    public String getDeviceNo() {
        return deviceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_device.device_no
     *
     * @param deviceNo the value for user_device.device_no
     *
     * @mbggenerated Wed Jun 01 21:47:50 CST 2016
     */
    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo == null ? null : deviceNo.trim();
    }
}