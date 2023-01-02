package com.accenture;

public class Empire {
	Guesser guesser;
	Player player;
	
	public Empire(Guesser guesser, Player player) {
		this.player = player;
		this.guesser = guesser;
	}
	
	public void info() {
		System.out.println("Guess number is " + guesser.getGuessNum());
		System.out.println("Player 1 number is " + player.getNumP1());
		System.out.println("Player 2 number is " + player.getNumP2());
		System.out.println("Player 3 number is " + player.getNumP3());
	}
	
	public void askPlayerNums() {
		player.chooseNum();
	}
	
	public void askGuesserNum() {
		guesser.chooseNum();
	}
	
	public void compare() {
		int guessNum = guesser.getGuessNum();
		String output = guessNum == player.getNumP1() ? 
				"Guesser number matches player 1!" : guessNum == player.getNumP2() ?
						"Guesser number matches player 2!" : guessNum == player.getNumP3() ?
								"Guesser number matches player 3!" : "Guesser does not matches any numbers!";
		System.out.println(output);
	}
}
