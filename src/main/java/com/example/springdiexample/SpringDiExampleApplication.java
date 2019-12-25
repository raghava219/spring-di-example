package com.example.springdiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springdiexample.controller.ConstructorInjectedController;
import com.example.springdiexample.controller.MyController;
import com.example.springdiexample.controller.PropertyInjectedController;
import com.example.springdiexample.controller.SetterInjectedController;
import com.example.springdiexample.services.GreetingServiceImpl;

@SpringBootApplication
public class SpringDiExampleApplication {

	private static PropertyInjectedController pi_using_spring = null;
	private static PropertyInjectedController pi = null;
	private static ConstructorInjectedController ci_using_spring = null;
	private static ConstructorInjectedController ci = null;
	private static SetterInjectedController si_using_spring = null;
	private static SetterInjectedController si = null;
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringDiExampleApplication.class, args);
		
		MyController my = ctx.getBean(MyController.class);
		
		// Below line is for Property injection using Spring framework
		pi_using_spring = ctx.getBean(PropertyInjectedController.class);
		
		// Below two lines are for Property injection without using Spring framework
		pi = new PropertyInjectedController();
		pi.greetingService = new GreetingServiceImpl();
		
		// Below line is for Constructor injection using Spring framework
		ci_using_spring = ctx.getBean(ConstructorInjectedController.class);
		
		// Below line is for Constructor injection without using Spring framework
		ci = new ConstructorInjectedController(new GreetingServiceImpl());
		
		// Below line is for Setter injection using Spring framework
		si_using_spring = ctx.getBean(SetterInjectedController.class);
		
		// Below line is for Setter injection without using Spring framework
		si = new SetterInjectedController();
		si.setGreetingService(new GreetingServiceImpl());
		
		
		System.out.println(my.hello());
		System.out.println(pi_using_spring.sayHello());
		System.out.println(ci_using_spring.sayHello());
		System.out.println(si_using_spring.sayHello());
		
		System.out.println(pi.sayHello());
		System.out.println(ci.sayHello());
		System.out.println(si.sayHello());
		
		
		
		
	}

}
