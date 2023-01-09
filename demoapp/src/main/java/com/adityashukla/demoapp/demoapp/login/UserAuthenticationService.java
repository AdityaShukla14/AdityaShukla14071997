package com.adityashukla.demoapp.demoapp.login;

import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationService {
	public boolean authenticateUser	(String username,String password) {
		boolean isvalidUsername= username.equalsIgnoreCase("AdityaShukla");
		boolean isvalidPassword= password.equalsIgnoreCase("Password");
		return isvalidPassword && isvalidUsername;
	}
}
