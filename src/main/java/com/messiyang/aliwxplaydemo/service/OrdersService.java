package com.messiyang.aliwxplaydemo.service;

import com.messiyang.aliwxplaydemo.pojo.Orders;

public interface OrdersService {

    /**
     * 新增订单
     * @param order
     */
     void saveOrder(Orders order);

    /**
     *
     * @Title: OrdersService.java
     * @Package com.sihai.service
     * @Description: 修改叮当状态，改为 支付成功，已付款; 同时新增支付流水
     */
     void updateOrderStatus(String orderId, String alpayFlowNum, String paidAmount);

    /**
     * 获取订单
     * @param orderId
     * @return
     */
     Orders getOrderById(String orderId);
}
