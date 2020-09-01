package com.bright.domain;

import java.util.List;

/**
 * @author 徐亮亮
 * @date 2020/8/26
 */
public class VO {
    private List<User> userList;

    public VO() {
    }

    public VO(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
