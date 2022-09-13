package chapter.Chapter_05;

import java.util.Scanner;

public class C05E09 {

	public static void main(String[] args) {
		System.out.println("Enter the number of students: ");
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int max = 1;
		int sec = 0;
		String maxStu = "";
		String secStu = "";

		for (int i = 0; i < s; i++) {
			System.out.println("Enter name and score of student (" + (i + 1) + "):");
			String name = input.next();
			int score = input.nextInt();
			if (score > max) {
				sec = max;
				secStu = maxStu;
				max = score;
				maxStu = name;
			} else if (score > sec) {
				sec = score;
				secStu = name;
			}
		}
		System.out.println("The student with the highest score is " + maxStu);
		System.out.println("The highest score is " + max);
		System.out.println("The student with the second highest score is " + secStu);
		System.out.println("The second highest score is " + sec);
	}
}