package com.bright.dao.impl;

import com.bright.dao.UserDao;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author 徐亮亮
 * @date 2020/8/23
 */

// <bean id="userDao" class="com.bright.dao.impl.UserDaoImpl"/>
// @Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("Saving...");
    }
}
