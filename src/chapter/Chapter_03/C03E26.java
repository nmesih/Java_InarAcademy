package chapter.Chapter_03;

import java.util.Scanner;

public class C03E26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int numb = input.nextInt();
		
		System.out.print("Is " + numb + " divisible by 5 and 6? ");
		if (numb % 5 == 0 && numb % 6 == 0) {
		System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.print("Is " + numb + " divisible by 5 or 6? ");
		if (numb % 5 == 0 || numb % 6 == 0) {
		System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.print("Is " + numb + " divisible by 5 or 6, but not both? ");
		if (numb % 5 == 0 ^ numb % 6 == 0) {
		System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
