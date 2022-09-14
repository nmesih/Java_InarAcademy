package chapter.Chapter_05;

import java.util.Scanner;

public class C05E16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");

		int n = input.nextInt();
		int i = 2;
		String s = "";

		while (n != 1) {
			if (n % i == 0) {
				s = s + i + ", ";
				n = n / i;
				i = 2;
			} else {
				i++;
			}

		}

		System.out.print("The smallest factors are: " + s);
	}
}
