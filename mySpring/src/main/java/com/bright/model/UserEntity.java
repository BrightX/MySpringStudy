package com.bright.model;

/**
 * @author 徐亮亮
 * @date 2020/6/3
 */
public class UserEntity {
    private Long id;
    private String userName;
    private String userSex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
