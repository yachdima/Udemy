package com.Luv2code.springdemo;

public class My7RunCoach implements Coach {
	private FortuneService fortuneService;
	
	public My7RunCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run Forest Run!!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
