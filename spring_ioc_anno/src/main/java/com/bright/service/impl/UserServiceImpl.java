package com.bright.service.impl;

import com.bright.dao.UserDao;
import com.bright.service.UserService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author 徐亮亮
 * @date 2020/8/23
 */

// <bean id="userService" class="com.bright.service.impl.UserServiceImpl">
//     <property name="userDao" ref="userDao"/>
// </bean>
// @Component("userService")
@Service("userService")
// @Scope("singleton")
// @Scope("prototype")
public class UserServiceImpl implements UserService {

    // @Value("Bright")  // 注入普通数据类型
    @Value("${jdbc.driver}")  // 注入普通数据类型
    private String driver;

    // <property name="userDao" ref="userDao"/>
    // @Autowired  // 按照数据类型从Spring容器中进行匹配
    // @Qualifier("userDao")  // 按照id值从Spring容器中进行匹配， 但要结合Autowired一起使用
    @Resource(name = "userDao")  // 等效于 @Qualifier + @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("driver = " + driver);
        userDao.save();
    }

    // 使用注解方式，可以不定义setter方法
    // public void setUserDao(UserDao userDao) {
    //     this.userDao = userDao;
    // }

    @PostConstruct
    public void init() {
        System.out.println("初始化方法...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁方法...");
    }
}
