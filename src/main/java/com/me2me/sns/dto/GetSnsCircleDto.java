package com.me2me.sns.dto;

import com.me2me.common.web.BaseEntity;
import lombok.Data;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 代宝磊
 * Date: 2016/6/28
 * Time :15:24
 */
@Data
public class GetSnsCircleDto implements BaseEntity{

    private long uid;

    private long topicId;

    private int type;

    private long sinceId;
}
