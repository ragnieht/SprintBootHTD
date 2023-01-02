package com.accenture;

import java.util.Scanner;

public class Player {
	int numP1 = 15;
	int numP2 = 14;
	int numP3 = 13;
	
	public Player(int numP1, int numP2, int numP3) {
		super();
		this.numP1 = numP1;
		this.numP2 = numP2;
		this.numP3 = numP3;
	}
	
	public Player() {		
		this.numP1 = numP1;
		this.numP2 = numP2;
		this.numP3 = numP3;
	}

	public int getNumP1() {
		return numP1;
	}

	public void setNumP1(int numP1) {
		this.numP1 = numP1;
	}

	public int getNumP2() {
		return numP2;
	}

	public void setNumP2(int numP2) {
		this.numP2 = numP2;
	}

	public int getNumP3() {
		return numP3;
	}

	public void setNumP3(int numP3) {
		this.numP3 = numP3;
	}	

    public void chooseNum() {
    	Scanner s = new Scanner(System.in);
        System.out.println("What is player 1 number?");        
        numP1 = s.nextInt();
        System.out.println("What is player 2 number?");        
        numP2 = s.nextInt(); 
        System.out.println("What is player 3 number?");        
        numP3 = s.nextInt();
    }
}
