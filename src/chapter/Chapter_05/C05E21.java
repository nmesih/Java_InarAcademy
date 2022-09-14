package chapter.Chapter_05;

import java.util.Scanner;

public class C05E21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter loan amount:");
		  double lA= input.nextDouble();
		 
		  System.out.print("Enter number of years: ");
		  int years = input.nextInt();
		 
		  double annualInterestRate = 5.0;
		  
		  System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		  
		  int a = 1;
		  while(annualInterestRate <= 8.0) {
			  //(lA * years * (annualInterestRate/100)) / 1200;
			  double monthlyRate = annualInterestRate / 1200;
			  double monthlyPayment = lA * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));;
			  double totalPayment = monthlyPayment * years * 12;
			  System.out.printf("%-20.3f%-20.3f%-20.2f\n" ,annualInterestRate, monthlyPayment, totalPayment);
			  
			  annualInterestRate += 0.125;
		  }  
		  
	}

}
