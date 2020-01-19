package com.Luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class My7JavaConfig {
		//define bean for our fortune service
		@Bean
		public FortuneService my7FortuneService() {
			return new My7FortuneService();
		}
		
		//define bean for our swim coach AND inject dependency
		@Bean
		public Coach runCoach() {
			return new My7RunCoach(my7FortuneService());
		}
}
