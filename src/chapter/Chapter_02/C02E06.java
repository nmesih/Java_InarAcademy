package chapter.Chapter_02;

import java.util.Scanner;

public class C02E06 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer between 0 and 1000: ");
		int number = input.nextInt();
		
		int firstDigit = number % 10;
		int remainingNumber = number / 10;
		int SecondDigit = remainingNumber % 10;
		remainingNumber /= 10;
		int thirdDigit = remainingNumber %10;
		
		int sum = thirdDigit + SecondDigit + firstDigit;
		
		System.out.println("The sum of digits in " + number + " is " + sum + ".");
		
		
	}

}
