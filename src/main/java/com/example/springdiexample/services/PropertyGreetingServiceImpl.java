package com.example.springdiexample.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURU = "Hello Gurus!!!! - Properties";
	
	@Override
	public String sayGreeting() {
		return HELLO_GURU;
	}

}
