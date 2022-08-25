package chapter.Chapter_02;

/*
 * Write a program that prompts the user to enter a temperature between -58 ºF and 41ºF and
   a wind speed greater than or equal to 2 and displays the wind-chill temperature.
 */

import java.util.Scanner;

public class C02E17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Fahrenheit between -58 F and 41 F:");
		double temp = input.nextDouble();

		System.out.println("Enter the wind speed (>=2) in miles per hour:");
		double speed = input.nextDouble();
		
		double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);
		
		System.out.print("The wind chill index is " + windChill);
		
	}

}
