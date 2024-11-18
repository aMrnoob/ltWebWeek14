package com.example.thymeleaf.model;

public class User {
	
	private String fullName;
	private String email;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String fullName, String email, String password) {
		// TODO Auto-generated constructor stub
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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
