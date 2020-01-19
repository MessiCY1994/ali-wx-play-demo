package com.messiyang.aliwxplaydemo.service;

import com.messiyang.aliwxplaydemo.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 用户新增
     *
     * @param user
     */
    void saveUser(User user);

    /**
     * @param user
     * @Description: 更新用户
     */
    void updateUserById(User user);

    /**
     * @param userId
     * @Description: 删除用户
     */
    void deleteUserById(String userId);

    /**
     * @param userId
     * @return User
     * @Description: 根据用户主键ID获取用户信息
     */
    User getUserById(String userId);

    /**
     * @return
     * @Description: 获取用户列表
     */
    List<User> getUserList();
}