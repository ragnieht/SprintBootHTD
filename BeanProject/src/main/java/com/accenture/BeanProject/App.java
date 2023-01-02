package com.accenture.BeanProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.accenture.BeanProject.*;

public class App {
	public static void main(String[] args) {
		ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfig.class);
		JdbcTemplate template = context1.getBean("connection",JdbcTemplate.class);
		System.out.println("Connection Object from Database -> " + template);		
			
        ApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println("!---------------------!");                
        Animal animal = context2.getBean("getAnimalBean",Animal.class);
        System.out.println("Animal Bean Obj is " + animal);
        animal.info();
	}
}
