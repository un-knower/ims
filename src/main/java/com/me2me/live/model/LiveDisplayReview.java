package com.me2me.live.model;

import com.me2me.common.web.BaseEntity;

import java.util.Date;

public class LiveDisplayReview implements BaseEntity{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_review.id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_review.topic_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Long topicId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_review.uid
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_review.type
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_review.review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private String review;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_review.at_uid
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Long atUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_review.top_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Long topId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_review.bottom_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Long bottomId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_review.create_time
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_review.id
     *
     * @return the value of live_display_review.id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_review.id
     *
     * @param id the value for live_display_review.id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_review.topic_id
     *
     * @return the value of live_display_review.topic_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_review.topic_id
     *
     * @param topicId the value for live_display_review.topic_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_review.uid
     *
     * @return the value of live_display_review.uid
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_review.uid
     *
     * @param uid the value for live_display_review.uid
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_review.type
     *
     * @return the value of live_display_review.type
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_review.type
     *
     * @param type the value for live_display_review.type
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_review.review
     *
     * @return the value of live_display_review.review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public String getReview() {
        return review;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_review.review
     *
     * @param review the value for live_display_review.review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setReview(String review) {
        this.review = review == null ? null : review.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_review.at_uid
     *
     * @return the value of live_display_review.at_uid
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Long getAtUid() {
        return atUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_review.at_uid
     *
     * @param atUid the value for live_display_review.at_uid
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setAtUid(Long atUid) {
        this.atUid = atUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_review.top_id
     *
     * @return the value of live_display_review.top_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Long getTopId() {
        return topId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_review.top_id
     *
     * @param topId the value for live_display_review.top_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setTopId(Long topId) {
        this.topId = topId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_review.bottom_id
     *
     * @return the value of live_display_review.bottom_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Long getBottomId() {
        return bottomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_review.bottom_id
     *
     * @param bottomId the value for live_display_review.bottom_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setBottomId(Long bottomId) {
        this.bottomId = bottomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_review.create_time
     *
     * @return the value of live_display_review.create_time
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_review.create_time
     *
     * @param createTime the value for live_display_review.create_time
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}