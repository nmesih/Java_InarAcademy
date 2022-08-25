package chapter.Chapter_02;

/*
  Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting a double value to an int value. 
  Enter the input as an integer whose last two digits represent the cents.For example, the input 1156 represents 11 dollars and 56 cents
 */

import java.util.Scanner;

public class C02E22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the input as an integer whose last two digits represent the cents: ");
		
		int amount = input.nextInt();
		//Find the number of the dollars
		int numberOfOneDollars = amount / 100;
		//Find the number of cents
		int remainingAmount = amount % 100;
	
		  // Display results
		  System.out.println("Your amount " + amount + " consists of " + numberOfOneDollars + " dollars " + remainingAmount + " cents ");
		  
		
	}

}
