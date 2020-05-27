/*
* Bagles.java
* Author: JiaoAng Dong
* Submission Date: 10/18/2019
*
* Purpose: This is the main class of the project
* and combines the methods in player.java and
* engine.java to take in the user's inputs and
* generate the game
 *
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
import java.util.Scanner;

public class Bagles {

	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Player userPlay;
		Engine number = new Engine();
		
		// use the class player and engine
		
		String userName = "";
		int digit = 0;
		int numMoves = 0;
		String guess = "";
		int [] userArray;
		int [] secretArray;
		boolean Continueorno;
		String userChoice ="";
		int gameCount;
		int loopforrepeat = 1;
		
		// Initialize all the needed variables and arrays
		
		System.out.println("welcome!");
				
		while (loopforrepeat == 1) {
			userPlay = new Player();
			System.out.print("\nEnter the number of digits to use: ");
			digit = keyboard.nextInt();
			keyboard.nextLine();
			System.out.print("Enter the player's name: ");
			userName = keyboard.nextLine();
			
			userPlay.setName(userName);
			number.setNumDigits(digit);
			loopforrepeat = 2;
		//takes in the name and number of digits for the number
			
		while (loopforrepeat == 2) {
			gameCount = userPlay.getGamesCompleted();
			System.out.println("\nStarting game #" + (gameCount + 1  ) + ".\n");
		    number.generateNewSecret();
		
		do
		{
			guess = userPlay.askForGuess();
			userArray = number.convertNumToDigitArray(guess);
			secretArray = number.getSecetNumber();
			Continueorno = Validator.validateGuess(secretArray, userArray, number.getNumbDigits());
			numMoves++;
			
		}
		//to start a new game, get the guess input, and match using methods from engine class
		// determine when to stop (Continueorno) and calculate the number of steps/moves
		
		while (!(Continueorno));
		
		System.out.println("Congratulations! You won in " + numMoves + " moves. ");
		userPlay.updateStats(numMoves);
		
		System.out.println("\nStatistics for " + userPlay.getName() + ":");
		System.out.println("Games completed: " + (gameCount + 1));
		System.out.println("Number of digits: " + number.getNumbDigits());
		System.out.println("fastest win: " + userPlay.getFastestWin() + " guesses ");
		System.out.println("p - Play Again\nr - Reset game\nq - Quit");
		System.out.println("\nWhat would you like to do? ");
		userChoice = keyboard.nextLine();
		numMoves = 0;
		if (userChoice.equalsIgnoreCase("play again") || userChoice.equalsIgnoreCase("p"))
		{
			loopforrepeat = 2;
		}
		else if (userChoice.equalsIgnoreCase("reset game") || userChoice.equalsIgnoreCase("r"))
		{
			loopforrepeat = 1;
		}
		else if (userChoice.equalsIgnoreCase("quit") || userChoice.equalsIgnoreCase("q"))
		{
			System.out.println("\nGoodbye!");
			System.exit(0);
		}
		
		// post win conditions. gives stats and the user have the choice of p,r,q

	
         	}
	
	
		}
	}
	
}
