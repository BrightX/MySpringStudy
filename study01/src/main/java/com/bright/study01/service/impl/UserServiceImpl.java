package com.bright.study01.service.impl;

import com.bright.study01.dao.UserDao;
import com.bright.study01.service.UserService;

/**
 * @author 徐亮亮
 * @date 2020/8/23
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void save() {
        userDao.save();
    }
}
