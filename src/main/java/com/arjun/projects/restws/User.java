package com.arjun.projects.restws;

public class User {
	private int userid;
	private String name;
	private int age;
	private String email;
	private String password;
	
//	default constructor
	public User() {
		this.userid= 0;
		this.name="default";
		this.age=0;
		this.email="@default.com";
		this.password="default";
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
