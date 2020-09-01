package com.bright.service.impl;

import com.bright.dao.UserDao;
import com.bright.service.UserService;

/**
 * @author 徐亮亮
 * @date 2020/8/23
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void save() {
        userDao.save();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
