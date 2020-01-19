package com.Luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFortuneService implements FortuneService {
	
	@Value("${foo.goodfortune}")
	private String goodfortune;
	
	@Value("${foo.verygoodfortune}")
	private String verygoodfortune;
	
	@Value("${foo.neitralfortune}")
	private String neitralfortune;

	private Random random = new Random();

	@Override
	public String getFortune() {
		String[] data = {
				goodfortune,
				verygoodfortune,
				neitralfortune
				};
		
		int index = random.nextInt(data.length);
		return data[index];
	}

}
