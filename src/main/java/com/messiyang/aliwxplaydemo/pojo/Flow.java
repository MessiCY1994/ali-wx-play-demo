package com.messiyang.aliwxplaydemo.pojo;

import lombok.Data;

import java.util.Date;

@Data
/**
 * 流水表
 */
public class Flow {
    private String id;
    /**
     * 流水号
     */
    private String flowNum;
    /**
     * 订单号
     */
    private String orderNum;
    /**
     * 产品主键ID
     */
    private String productId;
    /**
     * 支付金额
     */
    private String paidAmount;
    /**
     * 支付方式\r\n            1：支付宝\r\n            2：微信
     */
    private Integer paidMethod;
    /**
     * 购买个数
     */
    private Integer buyCounts;
    /**
     * 创建时间
     */
    private Date createTime;

}