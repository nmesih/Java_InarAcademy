package chapter.Chapter_03;

import java.util.Scanner;

public class C03E27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point's x- and y- coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double x1 = 200;
		double y1 = 100;
		
		// Hipotenus'ten geçen doğrunun denkleminin formülü ile noktaların üçgenin içinde kalıp kalmadığını buluyoruz.
		if (( (y >= 0) && (x >= 0) && (x + 2 * y <= 200) )) {
			System.out.println("The point is in the triangle.");
		}else {
			System.out.println("The point is not in the triangle.");
		}
			
		
	}

}
