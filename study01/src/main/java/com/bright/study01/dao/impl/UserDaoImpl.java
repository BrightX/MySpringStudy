package com.bright.study01.dao.impl;

import com.bright.study01.dao.UserDao;

/**
 * @author 徐亮亮
 * @date 2020/8/23
 */
public class UserDaoImpl implements UserDao {

    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl 创建");
    }

    @Override
    public void save() {
        System.out.println("username = " + username);
        System.out.println("age = " + age);
        System.out.println("UserDaoImpl 保存。。。");
    }

    public void init() {
        System.out.println("初始化");
    }

    public void destroy() {
        System.out.println("销毁");
    }
}
