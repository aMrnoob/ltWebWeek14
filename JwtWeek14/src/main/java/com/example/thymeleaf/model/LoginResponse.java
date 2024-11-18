package com.example.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginResponse {
	
	private String token;
	
	private long expiresIn;
	
	public String getToken() {
		return token;
	}
}
