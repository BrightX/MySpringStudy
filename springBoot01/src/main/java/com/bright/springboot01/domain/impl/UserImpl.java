package com.bright.springboot01.domain.impl;

import com.bright.springboot01.domain.User;

/**
 * @author 徐亮亮
 * @date 2020/9/2
 */
public class UserImpl implements User {
    private String name;
    private int age;
    private boolean gender;

    public UserImpl() {
    }

    public UserImpl(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserImpl)) {
            return false;
        }

        UserImpl userDao = (UserImpl) o;

        if (getAge() != userDao.getAge()) {
            return false;
        }
        if (isGender() != userDao.isGender()) {
            return false;
        }
        return getName().equals(userDao.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + (isGender() ? 1 : 0);
        return result;
    }

    @Override
    public void save() {
        System.out.println("User is Saving");
    }
}
