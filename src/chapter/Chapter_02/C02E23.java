package chapter.Chapter_02;

/*
 * Write a program that prompts the user to enter the distance to drive, 
   the fuel efficiency of the car in miles per gallon, and the price 
   per gallon, and displays the cost of the trip
 */
import java.util.Scanner;

public class C02E23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon: ");
		double miles = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double prices = input.nextDouble();
		
		double cost = (distance / miles) * prices ;		
				
		System.out.println("The cost of driving is " + (int)(cost * 100) /100.0);
		
	}
	

}
