package com.example.springdiexample.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURU = "Hello Gurus!!!! - Constructor";
	
	@Override
	public String sayGreeting() {
		return HELLO_GURU;
	}

}
