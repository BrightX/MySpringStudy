package com.bright.controller;

import com.bright.dao.UserDao;
import com.bright.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 徐亮亮
 * @date 2020/6/3
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;
    //使用注解方式

    /**
     * 获取所有用户
     *
     * @return list
     */
    @RequestMapping("/getAll2")
    public List<UserEntity> getAll2() {
        return userDao.getAll2();
    }

    /**
     * 根据id获取用户
     *
     * @return list
     */
    @RequestMapping("/getOne2")
    public List<UserEntity> getOne2(Long id) {
        return userDao.getOne2(id);
    }

    /**
     * 新增用户
     *
     * @param user 用户
     * @return String
     */
    @RequestMapping("/insertUser2")
    public String insertUser2(UserEntity user) {
        userDao.insertUser2(user);
        return "insert success";
    }

    /**
     * 修改用户
     *
     * @param user 用户
     * @return String
     */
    @RequestMapping("/updateUser2")
    public String updateUser2(UserEntity user) {
        userDao.updateUser2(user);
        return "update success";
    }

    /**
     * 删除用户
     *
     * @param id  用户 id
     * @return  String
     */
    @RequestMapping("/deleteUser2")
    public String deleteUser2(Long id) {
        userDao.deleteUser2(id);
        return "delete success";
    }
}
