package chapter.Chapter_05;

import java.util.Scanner;

public class C05E08 {

	public static void main(String[] args) {
		System.out.println("Enter the number of students: ");
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int max = 0;
		String maxStu = "";
		
		for (int i = 0; i < s; i++) {
			System.out.println("Enter name and score of student (" + (i + 1)+ "):");
			String name = input.next();
			int score = input.nextInt();
			if(score > max) {
				max = score;
				maxStu = name;
			}
		}
		System.out.println("The student with the highest score is " + maxStu);
		System.out.println("The highest score is " + max);
	}

}
