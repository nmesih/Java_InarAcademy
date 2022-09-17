package chapter.Chapter_05;

import java.util.Scanner;

public class C05E47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");
		String s = input.nextLine();
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			if ((i + 1) % 2 == 0) {
				sum += s.charAt(i) - '0';
			} else {
				sum += 3 * (s.charAt(i) - '0');
			}
		}

		sum %= 10;
		sum = 10 - sum;
		System.out.println("The ISBN-13 number is " + s + sum);

	}

}
