package chapter.Chapter_02;

/*
 * Write a program that prompts the user to enter the side of a hexagon and 
   displays its area. 
 */

import java.util.Scanner;

public class C02E16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the side: ");
		double s = input.nextDouble();
		double area = (3 * Math.pow(3, 0.5) / 2) * Math.pow(s, 2);
		
		System.out.println("The area of the hexagon is " + area);

	}

}
