package com.messiyang.aliwxplaydemo.pojo;

import lombok.Data;

@Data
/**
 * 用户表
 */
public class User {
    private String id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 性别
     */
    private String sex;
    
}