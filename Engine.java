/*
* Engine.java
* Author: JiaoAng Dong
* Submission Date: 10/18/2019
*
* Purpose: This class computes the basic methods 
* of the numbers in the Bagel game. For example:
* the methods is able to generate random secret
* numbers. Its able to make num to array which will
* be used for the guessing later on in bagels.java
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
import java.util.Random;

public class Engine {
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator = new Random();
	
	// Initialized the private instance variables
	
	public int[] convertNumToDigitArray(String number) {
		
		int[] numGuess = new int[number.length()];
		
		for ( int i = 0 ; i < number.length(); i++) {
			numGuess[i] = Integer.parseInt(number.substring(i,i+1));
		}
		return numGuess;
		}
	
	// converNumToDigitArray
	// pre condition: local variable number (type string)
	// post condition: returns numGuess, which is an array
	// of integers that contains the digits.
	
	public int getNumbDigits() {
		return numDigits;
	}
	
	// getNumbDigits
	// precondition: no instance variable
	// postcondtion: returns the number of digits 
	
	public int[] getSecetNumber(){
		int[] copy1 = new int[numDigits];
		
		for (int i = 0 ; i < numDigits; i++) {
			copy1[i] = secretNumber[i];
		}
		return copy1;
		
	}
	
	// getNumbDigits
	// precondition: no instance variable 
	// postcondtion: returns the secret number
	
	public void generateNewSecret() {
		secretNumber = new int[numDigits];
		int indexVal = 0;
		
		for( int i = 0 ; i < numDigits ; i++) {
			indexVal = randomNumberGenerator.nextInt(10);
			if ((i==0) && (indexVal == 0)) {
				i--;
			}
			else {
				secretNumber[i] = indexVal;
			}
		}
	}
	
	// generateNewSecret -
	// precondition: old secretNumber 
	// postcondtion: returns a updated secretNumber for a new
	// game
	
	public void setNumDigits(int numDigits) {
		this.numDigits = numDigits;
	}
	
	//setNumDigits -
	//precondition: positive integer numDigits
	//Postcondition: set the numDigits to the input

	public void setSecretNumber( int[] secretNumber) {
		this.secretNumber = new int[secretNumber.length];
		
		for ( int i = 0 ; i < secretNumber.length ; i++) {
			this.secretNumber[i]= secretNumber[i];
		}
		
	 //setSecretNumber -
	 //precondition:  array of type integer
	 //Postcondition: set the values to a copy of the 
	 //values in the secretNumber parameter
		
	}
	
}
	
	
	
	
	

