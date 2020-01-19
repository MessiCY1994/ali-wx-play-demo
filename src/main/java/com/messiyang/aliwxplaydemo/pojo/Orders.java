package com.messiyang.aliwxplaydemo.pojo;

import lombok.Data;

import java.util.Date;

@Data
/**
 * 订单表
 */
public class Orders {
    private String id;
    /**
     * 订单号
     */
    private String orderNum;
    /**
     * 订单状态 10：待付款           20：已付款
     */
    private String orderStatus;
    /**
     * 订单金额
     */
    private String orderAmount;
    /**
     * 实际支付金额
     */
    private String paidAmount;
    /**
     * 产品表外键ID
     */
    private String productId;
    /**
     * 产品购买的个数
     */
    private Integer buyCounts;
    /**
     * 订单创建时间
     */
    private Date createTime;
    /**
     * 支付时间
     */
    private Date paidTime;
}