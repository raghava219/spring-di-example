package com.example.springdiexample.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingServiceImpl implements GreetingService {

	private GreetingRepository greetingRepository;
	
	public PrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	@Override
	public String sayGreeting() {
		return greetingRepository.getEnglishGreeting();
	}

}
