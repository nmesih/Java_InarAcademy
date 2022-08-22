package chapter.Chapter_02;

import java.util.Scanner;

public class C02E01 {

	/*
	 *  Write a program that reads a Celsius degree in a double value from the console,
	 *  then converts it to Fahrenheit and displays the result. 
	 *  The formula for the conversion is as follows:
	 *  fahrenheit = (9 / 5) * celsius + 32
	 */

		public static void main(String[] args) {
			System.out.println("Enter a degree in Celsius: ");
			
			Scanner keyboard = new Scanner(System.in);
			
			int Celsius = keyboard.nextInt();
			
			double Fahrenheit = (9.0 / 5) * Celsius + 32 ;
			
			System.out.println(Celsius + " Celsius " + " is " + Fahrenheit + " Fahrenheit" );
			

		}

}
