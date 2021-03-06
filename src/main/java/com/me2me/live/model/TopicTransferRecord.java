package com.me2me.live.model;

import java.util.Date;

import com.me2me.common.web.BaseEntity;

public class TopicTransferRecord  implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_transfer_record.id
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_transfer_record.topic_id
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    private Long topicId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_transfer_record.new_uid
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    private Long newUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_transfer_record.old_uid
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    private Long oldUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_transfer_record.price
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    private Integer price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_transfer_record.price_RMB
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    private Double priceRmb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_transfer_record.create_time
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_transfer_record.id
     *
     * @return the value of topic_transfer_record.id
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic_transfer_record.id
     *
     * @param id the value for topic_transfer_record.id
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_transfer_record.topic_id
     *
     * @return the value of topic_transfer_record.topic_id
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic_transfer_record.topic_id
     *
     * @param topicId the value for topic_transfer_record.topic_id
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_transfer_record.new_uid
     *
     * @return the value of topic_transfer_record.new_uid
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public Long getNewUid() {
        return newUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic_transfer_record.new_uid
     *
     * @param newUid the value for topic_transfer_record.new_uid
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public void setNewUid(Long newUid) {
        this.newUid = newUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_transfer_record.old_uid
     *
     * @return the value of topic_transfer_record.old_uid
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public Long getOldUid() {
        return oldUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic_transfer_record.old_uid
     *
     * @param oldUid the value for topic_transfer_record.old_uid
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public void setOldUid(Long oldUid) {
        this.oldUid = oldUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_transfer_record.price
     *
     * @return the value of topic_transfer_record.price
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic_transfer_record.price
     *
     * @param price the value for topic_transfer_record.price
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_transfer_record.price_RMB
     *
     * @return the value of topic_transfer_record.price_RMB
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public Double getPriceRmb() {
        return priceRmb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic_transfer_record.price_RMB
     *
     * @param priceRmb the value for topic_transfer_record.price_RMB
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public void setPriceRmb(Double priceRmb) {
        this.priceRmb = priceRmb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_transfer_record.create_time
     *
     * @return the value of topic_transfer_record.create_time
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic_transfer_record.create_time
     *
     * @param createTime the value for topic_transfer_record.create_time
     *
     * @mbggenerated Sat Jul 01 16:48:29 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}