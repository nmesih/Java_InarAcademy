package chapter.Chapter_05;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of the line: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int k = n; k > i; k--) {
				System.out.print("   ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.printf("%3d", j);
			}
			for(int m = 2; m <= i ; m++) {
				System.out.printf("%3d", m);
			}
			System.out.println();
		}
	}

}
