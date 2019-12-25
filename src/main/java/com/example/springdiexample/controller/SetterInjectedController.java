package com.example.springdiexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.springdiexample.services.GreetingService;

@Controller
public class SetterInjectedController {
	
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

	@Autowired
	@Qualifier("setterGreetingServiceImpl")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
}
