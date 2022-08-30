package chapter.Chapter_03;

import java.util.Scanner;

public class C03E23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		

		if ((-5 <= x && x <= 5) && (-2.5 <= y && y <= 2.5)) {
			System.out.println("Point (" + x + " , " + y + ") is in the rechtangle ");
		} else 
			System.out.println("Point (" + x + " , " + y + ") is not in the rechtangle ");
	}
}


