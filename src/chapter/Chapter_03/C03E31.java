package chapter.Chapter_03;

import java.util.Scanner;

public class C03E31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double eRate = input.nextDouble();
		
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int convert = input.nextInt();
		
		if (convert == 0) {
			System.out.println("Enter the dollar amount: ");
			double dolarAmount = input.nextDouble();
			System.out.println("$"+ dolarAmount + " is " + dolarAmount * eRate + " yuan");
		} else if (convert == 1) {
			System.out.println("Enter the RMB amount: ");
			double rmbAmount = input.nextDouble();
			System.out.println(rmbAmount + " yuan is $" + (int)(rmbAmount/eRate * 100)/100.0 );
		} else {
			System.out.println("Incorrect input");
		}
		
	}

}
