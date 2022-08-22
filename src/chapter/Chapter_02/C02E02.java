package chapter.Chapter_02;

import java.util.Scanner;

public class C02E02 {

	/*
	 * Write a program that reads in the radius and length of a cylinder 
	   and computes the area and volume using the following formulas:
	   
	   area = radius * radius * PI
	   volume = area * length
	   
	 */
	
	public static void main(String[] args) {
	
		final double PI = 3.14159;
		
		Scanner keyboard = new Scanner(System.in);
		
		double radius;
		
		double lenght;
		
		
		System.out.println("Enter the radius and lenght of a cylinder: ");
		
		radius = keyboard.nextDouble();
		lenght = keyboard.nextDouble();
		
		double area = radius * radius * PI;
		double volume = area * lenght;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is  " + volume);
		
	}

}
