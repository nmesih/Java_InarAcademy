package chapter.Chapter_05;

import java.util.Scanner;

public class C05E22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter loan amount:");
		  double lA= input.nextDouble();
		 
		  System.out.print("Enter number of years: ");
		  int numberOfYears = input.nextInt();
		 
		  System.out.println("Enter Annual Interest Rate: ");
		  double annualInterestRate = input.nextDouble();
		  
		  double monthlyInterestRate = annualInterestRate / 1200;
		  double monthlyPayment = lA * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		  
		  double balance = lA;
		  double interest = 1;
		  double principal = 1;
		  
		  System.out.printf("%-20s%-20s%-20s%-20s\n", "Payment#", "Interest", "Principal","Balance");
		  for (int i = 1; i <= numberOfYears * 12; i++) {
			  interest = monthlyInterestRate * balance;
			  principal = monthlyPayment - interest;
			  balance = balance - principal;
			  System.out.printf("%-20d%-20.2f%-20.2f%-20.2f\n" , i, interest, principal, balance);
			 }
		  
	}

}
