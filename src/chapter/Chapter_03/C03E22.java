package chapter.Chapter_03;

import java.util.Scanner;

public class C03E22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double dist = Math.pow((Math.pow(x, 2)+ Math.pow(y, 2)), 0.5);
				
		if (dist <= 10) {
			System.out.println("Point (" + x + " , " + y + ") is in the circle ");
		} else 
			System.out.println("Point (" + x + " , " + y + ") is not in the circle ");
	}

}
