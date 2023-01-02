package com.accenture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean 
	public Guesser guesserBean() {
		return new Guesser();
	}
	
	@Bean
	public Player playerBean() {
		return new Player();
	}
	
	@Bean
	public Empire empireBean() {
		return new Empire(guesserBean(), playerBean());
	}
}
