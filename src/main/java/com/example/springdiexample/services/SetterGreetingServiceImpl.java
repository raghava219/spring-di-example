package com.example.springdiexample.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURU = "Hello Gurus!!!! - Setters";
	
	@Override
	public String sayGreeting() {
		return HELLO_GURU;
	}

}
