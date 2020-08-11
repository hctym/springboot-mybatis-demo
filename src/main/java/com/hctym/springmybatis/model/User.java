package com.hctym.springmybatis.model;

import java.util.concurrent.ThreadPoolExecutor;

import static java.util.concurrent.Executors.*;

public class User {
    private Integer userId;

    private String userName;

    private String password;

    private String phone;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public static void main(String[] args) {
//        String
        String a = new String();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) newScheduledThreadPool(2);

    }
}