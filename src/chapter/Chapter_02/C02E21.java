package chapter.Chapter_02;

import java.util.Scanner;

public class C02E21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.println("Enter annual interest rate in percentage: ");
		double mounthlyInterestRate = input.nextDouble();
		mounthlyInterestRate = mounthlyInterestRate / 12;
		
		System.out.println("Enter number of years: ");
		double numberOfYears = input.nextDouble();
				
		double futureInvestmentValue = investmentAmount * Math.pow((1+ mounthlyInterestRate / 100), (numberOfYears * 12));
		
		System.out.println("Accumulated value is " + (int)(futureInvestmentValue * 100) / 100.0);
	}

}
