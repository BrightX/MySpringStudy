package com.bright.study01.test;

import com.bright.study01.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐亮亮
 * @date 2020/8/23
 */
public class SpringTest {
    @Test
    public void userDaoTest() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        UserDao userDao2 = (UserDao) app.getBean("userDao");

        System.out.println("userDao1 = " + userDao1);
        System.out.println("userDao2 = " + userDao2);
        app.close();
    }
}
