package com.bright.study01.factory;

import com.bright.study01.dao.UserDao;
import com.bright.study01.dao.impl.UserDaoImpl;

/**
 * @author 徐亮亮
 * @date 2020/8/23
 */
public class DynamicFactory {

    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
