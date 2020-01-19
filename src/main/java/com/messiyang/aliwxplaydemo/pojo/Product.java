package com.messiyang.aliwxplaydemo.pojo;

import lombok.Data;

@Data
/**
 * 产品表
 */
public class Product {
    private String id;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 价格
     */
    private String price;
}