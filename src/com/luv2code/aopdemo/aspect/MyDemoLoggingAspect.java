package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Before("execution(public void addAccount())")
	public void beforeAddAcoountAdvice() {
		
		System.out.println("\n=======> Executing before addAccount()");
	}
}
