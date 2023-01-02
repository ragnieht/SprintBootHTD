package com.accenture.BeanProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.accenture.BeanProject")
@PropertySource("classpath:datasource.properties")

public class BeanConfig {	
	@Autowired
	Environment environment;
	
	private String URL = "url";
	private String USERNAME = "username"; 
	private String PASSWORD = "password";
	
	@Bean("connection")
	public JdbcTemplate getTemplateObject() throws Exception {
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setUrl(environment.getProperty(URL));
		dataSource.setUsername(environment.getProperty(USERNAME));
		dataSource.setPassword(environment.getProperty(PASSWORD));
				
		System.out.println(dataSource.getUsername());
		System.out.println(dataSource.getPassword());
		System.out.println(dataSource.getUrl());			
		
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public AnimalType getAnimalTypeBean() {
		return new AnimalType();
	}
	
	@Bean
	public Animal getAnimalBean() {
		return new Animal(getAnimalTypeBean());
	}
}
