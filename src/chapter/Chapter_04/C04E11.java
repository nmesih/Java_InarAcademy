package chapter.Chapter_04;

import java.util.Scanner;

public class C04E11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15): ");
		int i = input.nextInt();

		if (i < 0 || i > 15) {
			System.out.println(i + " is an invalid input");
		} else {
			System.out.println("The hex value is " + Integer.toHexString(i).toUpperCase());
		}
	}
}
