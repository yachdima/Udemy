package com.Luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class AikidoCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Do that you must do";
	}

}
