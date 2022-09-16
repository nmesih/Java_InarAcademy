package chapter.Chapter_05;

import java.util.Scanner;

public class C05E30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		double annIntRate = input.nextDouble();
		System.out.println("Enter number of months: ");
		double month = input.nextInt();
		
		double monthRate = annIntRate / 1200;
		double total = 0;
		
		for (int i = 1; i <= month; i++) {
			total = (amount + total) * (1 + monthRate);
			
		}
		System.out.print("Money in the saving account ");
		System.out.printf("%.3f", total);
	}
}
