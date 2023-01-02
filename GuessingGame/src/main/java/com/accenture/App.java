package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.accenture.*;

public class App {
	public static void main(String[] args) {
					
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println("!---------------------!");                
        Empire empire = context.getBean("empireBean",Empire.class);
        System.out.println("Animal Bean Obj is " + empire);
        // uncomment to ask for Player Number inputs, by default 15,14,13
//        empire.askPlayerNums();
        empire.askGuesserNum();
        empire.compare();
        empire.info();
	}
}
