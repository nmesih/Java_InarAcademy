package chapter.Chapter_03;

import java.util.Scanner;

public class C03E19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three edges for a triangle: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int perimeter = a + b + c;
		
		if (a + b <= c) {
			System.out.println("The input is invalid.");
		} else if (a + c <= b) {
			System.out.println("The input is invalid.");
		} else if (b + c <= a) {
			System.out.println("The input is invalid.");
		} else {
			System.out.println("The perimeter of the triangle is " + perimeter);
		}
	}

}
