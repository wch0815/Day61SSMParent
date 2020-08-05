package com.cheng.pojo;

public class Users {

	private int uid;
	private String username;
	private String password;
	private String email;

	@Override
	public String toString() {
		return "VIPUsers [uid=" + uid + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
