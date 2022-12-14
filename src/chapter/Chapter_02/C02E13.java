package chapter.Chapter_02;

import java.util.Scanner;

/*
 *	(Financial application: compound value) Suppose you save $100 each month into a  account
  	with the annual interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417. 
  	After the first month, the value in the account becomes
	100 * (1 + 0.00417) = 100.417
	After the second month, the value in the account becomes
	(100 + 100.417) * (1 + 0.00417) = 201.252 
	After the third month, the value in the account becomes
	(100 + 201.252) * (1 + 0.00417) = 302.507 
	and so on.
	Write a program that prompts the user to enter a monthly saving amount and displays
	the account value after the sixth month. (In Exercise 5.30, you will use a loop to 
	simplify the code and display the account value for any month.) 
    */

public class C02E13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the monthly saving amount: ");
		  double initialAmount = input.nextDouble();
		  double totalSavings = 0;
		  
		  totalSavings = (initialAmount + totalSavings) * 1.00417;
		  totalSavings = (initialAmount + totalSavings) * 1.00417;
		  totalSavings = (initialAmount + totalSavings) * 1.00417;
		  totalSavings = (initialAmount + totalSavings) * 1.00417;
		  totalSavings = (initialAmount + totalSavings) * 1.00417;
		  totalSavings = (initialAmount + totalSavings) * 1.00417;
		 
		  System.out.println("After the sixth month, the account value is " + (int) (totalSavings * 100) / 100.0);
		 
	
	}

}
