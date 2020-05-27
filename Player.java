/*
* Player.java
* Author: JiaoAng Dong
* Submission Date: 10/18/2019
*
* Purpose: The class computes the basic methods for the
* basic information for the player later used in the 
* Bagels game in Bagels.java ex: setting the name and 
* computing the number of games completed.
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

 public class Player {

	 private String name;
	 private int fastestWin;
	 private int gamesCompleted = 0;
	 private Scanner keyboard = new Scanner (System.in);
	 
	 
	// initialize the variables
	 
	 public String askForGuess() {
		 String userGuess;
		 System.out.print("Enter your guess: ");
		 userGuess = keyboard.nextLine();
		 return userGuess;
	 }
	 
	 // askForGuesses -
	 // Precondition: no instance variable is needed
	 // Postcondition: returns string userGuesses
	 
	 public String getName() {
		 return name;
	 }
	 
	 // getName -
	 // Precondition: no instance variable is needed
	 // Postcondition: returns player's name
	 
	 public int getFastestWin() {
		 
		 return fastestWin;
		 
	 }
	 
	 // getFastestWin -
	 // Precondition: no instance variable is needed
	 // Postcondition: returns the fastest win 
	 
	 
	 public int getGamesCompleted() {
		 
		 return gamesCompleted;
	 }
	 
	 // getGamesCompleted -
	 // Precondition: no instance variable is needed
	 // Postcondition: returns the number of games completed 
	 
	 public void setName(String name) {
		 
		 this.name = name;
	 }

	 // setName -
	 // Precondition: string name
	 // Postcondition: set the new string name
	 
	 public void updateStats(int numberOfMovesTakenToWin) {
		 gamesCompleted++;
		 if (this.fastestWin == 0) {
			 this.fastestWin = numberOfMovesTakenToWin;
		 }
	 
		 if (this.fastestWin > 0 && this.fastestWin > numberOfMovesTakenToWin) {
			 this.fastestWin = numberOfMovesTakenToWin;

		 }
	 
	 // updateStats -
	 // Precondition: positive integer numberofMovestakenTowin 
	 // Postcondition: returns integer fastest win and updates gamesCompleted
	 
	 
		 
	 }
 }	 
	 
	 
	 