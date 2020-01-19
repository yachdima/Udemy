package com.Luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennesCoach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennesCoach: inside of doMyCleanupStuff()");
	}
	
	//define a setter method
//	@Autowired
//	public void doSameCrazyStuff(FortuneService theFortuneService) {
//		System.out.println(">> inside doSameCrazyStuff() method");
//		fortuneService = theFortuneService;
//	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
