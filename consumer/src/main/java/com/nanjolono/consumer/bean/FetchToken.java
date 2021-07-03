package com.nanjolono.consumer.bean;

public class FetchToken {

	private static final long serialVersionUID = 1L;

	// 加密后的 JWT token串
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