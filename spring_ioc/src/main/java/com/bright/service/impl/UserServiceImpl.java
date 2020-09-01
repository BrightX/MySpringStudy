package com.bright.service.impl;

import com.bright.dao.UserDao;
import com.bright.service.UserService;

/**
 * @author 徐亮亮
 * @date 2020/8/23
 */

public class UserServiceImpl implements UserService {

    private String driver;

    private UserDao userDao;

    public void save() {
        System.out.println("driver = " + driver);
        userDao.save();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void init() {
        System.out.println("初始化方法...");
    }

    public void destroy() {
        System.out.println("销毁方法...");
    }
}
