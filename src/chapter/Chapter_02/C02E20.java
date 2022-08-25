package chapter.Chapter_02;

/*
  Write a program that reads the balance and the annual percentage interest rate and
  displays the interest for the next month.
 */

import java.util.Scanner;

public class C02E20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		double interest = balance * (annualInterestRate / 120);
		
		System.out.println("The interest is " + (int)(interest * 1000) / 10000.0);
		
		
	}

}
