package com.snakeAndLadderGame;

public class SnakeAndLadder {

	public static void main(String args[]) {

		int player1Position = 0;
		int player2Position = 0;
		int numberOfDieRolls = 0;

		int playersTurn = 1;

		while (player1Position != 100 && player2Position != 100) {

			int playStatus = (int) (Math.floor(Math.random() * 10) % 3);
			int dieValue = (int) (Math.floor(Math.random() * 10) % 6) + 1;

//			System.out.println("The die value is " + dieValue);

			if (playStatus == 0) {
				if (playersTurn == 1) {
					System.out.println("Player1 remained at " + player1Position);
					playersTurn = 2;
					
				}
				else {
					System.out.println("Player2 remained at " + player2Position);
					playersTurn = 1;

				}
			} else if (playStatus == 1) {

				if (playersTurn == 1) {
					player1Position += dieValue;

					if (player1Position > 100) {
						player1Position -= dieValue;
						System.out.println("Player1 remained at " + player1Position);
						playersTurn = 2;
					} else {
						System.out.println("Player1 moved to " + player1Position);
					}

				} else {
					player2Position += dieValue;

					if (player2Position > 100) {
						player2Position -= dieValue;
						System.out.println("Player2 remained at " + player2Position);
						playersTurn = 1;
					} else {
						System.out.println("Player2 moved to " + player2Position);
					}

				}

			} else if (playStatus == 2) {

				if (playersTurn == 1) {
					player1Position -= dieValue;

					if (player1Position < 0) {
						player1Position = 0;
					}

					System.out.println("Player1 fell to " + player1Position);
					
					playersTurn = 2;
				} else {
					player2Position -= dieValue;

					if (player2Position < 0) {
						player2Position = 0;
					}

					System.out.println("Player2 fell to " + player2Position);
					
					playersTurn = 1;
				}

			}

			numberOfDieRolls++;

		}
		
		if (player1Position == 100) {
			System.out.println("Player 1 won the game");
		}
		else {
			System.out.println("Player 2 won the game");
		}

		System.out.println("The dies are rolled " + numberOfDieRolls + " times");

	}

}
