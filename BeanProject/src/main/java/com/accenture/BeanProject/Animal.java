package com.accenture.BeanProject;

public class Animal {
	AnimalType type;
	
	public Animal(AnimalType type) {
		this.type = type;
	}
	
	public void info() {
		System.out.println("This type of this animal is " + type);
	}
}
