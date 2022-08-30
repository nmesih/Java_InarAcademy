package chapter.Chapter_03;

import java.util.Scanner;

public class C03E20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit between -58 F and 41 F:");
		double temp = input.nextDouble();
		
		if (temp < -58 || temp > 41) {
			System.out.println("The temperature is invalid.");
			System.exit(0);
		} 
		
	
		System.out.println("Enter the wind speed (>=2) in miles per hour:"); 
		double speed = input.nextDouble();
		double windChill;
		
		if (speed < 2) {
			System.out.println("The wind speed is invalid.");
			System.exit(0);
		}
		
		windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);
		
		System.out.println("The wind chill index is " + windChill);
	}

}
