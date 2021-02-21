package com.nanjolono.auth.model.biz;

public class User {
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void isExist(User userDto) throws IllegalAccessException {
        if(userDto == null){
            throw new IllegalAccessException("查询不到该用户");
        }
    }

    public void isThis() throws IllegalAccessException {
        if(this.id == null){
            throw new IllegalAccessException("查询不到该用户");
        }
    }

}
