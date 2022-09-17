package chapter.Chapter_05;

import java.util.Scanner;

public class C05E50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string:");
		String s = input.nextLine();
		int numbUp = 0;

		for (int i = 0; i < s.length(); i++) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				numbUp++;
			}
		}

		System.out.println("The number of uppercase letters is " + numbUp);
	}
}
