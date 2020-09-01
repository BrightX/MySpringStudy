package com.bright.study01.demo;

import com.bright.study01.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐亮亮
 * @date 2020/8/23
 */
public class UserController {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
