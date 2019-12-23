package com.faustobranco.CryptPasswordEncoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class CryptPasswordEncoderApplication {

	public static void main(String[] args) {

		String password = "pass123";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);

		System.out.println(hashedPassword);

		boolean isPasswordMatches= passwordEncoder.matches(password, hashedPassword);
		if(isPasswordMatches)  {
			// correct password
			System.out.println ("Correct Password!");
		}
      		else  {
      	// Wrong Password
			System.out.println ("Incorrect Password!");
		}

	}

}
