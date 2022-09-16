package chapter.Chapter_05;

import java.util.Scanner;

public class C05E38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int i = input.nextInt();
		String octal = "";
		
		while (i != 0) {
			   octal = i % 8 + octal;
			   i = i / 8;
			  }
		System.out.println("Octal value is " + octal);
	}

}
