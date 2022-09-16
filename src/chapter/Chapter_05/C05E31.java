package chapter.Chapter_05;

import java.util.Scanner;

public class C05E31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter the annual percentage yield: ");
		double annPerYield = input.nextDouble();
		System.out.println("Enter number of months: ");
		double month = input.nextDouble();

		double monthYield = annPerYield / 1200;
		double total = 1;
		total = amount;
		
		System.out.printf("%-10s%-10s", "Month", "CD Value");
			
		
		for (int i = 1; i <= month; i++) {
			total = total + total * monthYield;
			System.out.printf("\n%-10d%-10.2f", i, total);
		}
		
	}

}
