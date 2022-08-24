package chapter.Chapter_02;

import java.util.Scanner;

public class C02E11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long newPop = 0, current = 312_032_486;
		int time;
		int birth, death, immigrant;
		
		System.out.println("Enter the number of years: ");
		int years = input.nextInt();
		
		for (int i = 1; i <= years; i++) {
			   // Convert time to second
			   time = i * 365 * 24 * 60 * 60;
			   // Calculating population increase/decrease in each case
			   birth = time / 7;
			   death = time / 13;
			   immigrant = time / 45;
			   // calculate new population
			   newPop = current + birth - death + immigrant;
		
		}
	
		System.out.println("The population in " + years + " years is " + newPop);
	}

}
