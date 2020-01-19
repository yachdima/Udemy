package com.Luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class My7RunCoachCinfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(My7JavaConfig.class);
		
		Coach theCoach = context.getBean("runCoach", My7RunCoach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

}
