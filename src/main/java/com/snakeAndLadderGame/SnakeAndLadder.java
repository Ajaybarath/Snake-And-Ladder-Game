package com.snakeAndLadderGame;

public class SnakeAndLadder {
	
	public static void main(String args[]) {
		
		int player1Position = 0;
		
		int dieValue = (int) (Math.floor(Math.random()*10) % 6) + 1;
		
		System.out.println("The die value is " + dieValue);
		
		while (player1Position <= 100) {
			int playStatus =  (int) (Math.floor(Math.random()*10) % 3);
			
			if (playStatus == 0) {
				System.out.println("Player remained at " + player1Position);
			}
			else if (playStatus == 1) {
				player1Position += dieValue;
				System.out.println("Player moved to " + player1Position);
			}
			else if (playStatus == 2) {
				player1Position -= dieValue;
				System.out.println("Player fell by " + player1Position);
			}
			
			
		}
		
	}

}
