package com.accenture;

import java.util.Scanner;

public class Guesser {
	int guessNum = 0;

	public Guesser(int guessNum) {
		super();
		this.guessNum = guessNum;
	}
	
	public Guesser() {
		this.guessNum = guessNum;
	}

	public int getGuessNum() {
		return guessNum;
	}

	public void setGuessNum(int guessNum) {
		this.guessNum = guessNum;
	}
	
	public void chooseNum() {
    	Scanner s = new Scanner(System.in);
        System.out.println("What is guesser number?");        
        guessNum = s.nextInt();       
    }
}
