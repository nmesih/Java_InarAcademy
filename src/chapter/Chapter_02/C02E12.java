package chapter.Chapter_02;

/* (Physics: finding runway length) Given an airplane’s acceleration a and take-off 
    speed v, you can compute the minimum runway length needed for an airplane to 
	take off using the following formula:
	
	lenght = v2 / 2a 
	
	Write a program that prompts the user to enter v in meters/second (m/s) and the 
	acceleration a in meters/second squared (m/s2), and displays the minimum runway length.
 	*/
import java.util.Scanner;

public class C02E12 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter speed and acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		double length = Math.pow(v, 2) / (2 * a);
		
		System.out.println("The minimum runway length for this airplane is " + (int)(length * 1000) / 1000.0);
	}
}
