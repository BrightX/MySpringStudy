package com.bright.dao;

import com.bright.model.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 徐亮亮
 * @date 2020/6/3
 */
public interface UserDao {
    //使用注解方式

    /**
     * 获取所有用户
     *
     * @return List
     */
    @Select("select * from t_user")
    @Results({
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userSex", column = "user_sex")
    })
    List<UserEntity> getAll2();

    /**
     * 根据id获取用户
     *
     * @param id 用户id
     * @return List
     */
    @Select("select * from t_user where id=#{id}")
    @Results({
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userSex", column = "user_sex")
    })
    List<UserEntity> getOne2(Long id);

    /**
     * 新增用户
     *
     * @param user 用户
     */
    @Insert("insert into t_user (user_name,user_sex) values(#{userName},#{userSex})")
    void insertUser2(UserEntity user);

    /**
     * 修改用户
     *
     * @param user  用户
     */
    @Update("update t_user set user_name=#{userName},user_sex=#{userSex} where id=#{id}")
    void updateUser2(UserEntity user);

    /**
     * 删除用户
     *
     * @param id 用户id
     */
    @Delete("delete from t_user where id=#{id}")
    void deleteUser2(Long id);
}
