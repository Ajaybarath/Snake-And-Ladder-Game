package com.snakeAndLadderGame;

public class SnakeAndLadder {
	
	public static void main(String args[]) {
		int startPosition = 0;
		int palyer1 = 0;
		
		int dieValue = (int) (Math.floor(Math.random()*10) % 6) + 1;
		
		System.out.println("The die value is " + dieValue);
		
	}

}
