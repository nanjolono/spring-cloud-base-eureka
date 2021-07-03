package com.nanjolono.auth.bean;

import java.io.Serializable;

public class FetchToken implements Serializable {

    private static final long serialVersionUID = 1L;

    private String token;

    private String userName;

    private String password;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public FetchToken() {
    }
}
