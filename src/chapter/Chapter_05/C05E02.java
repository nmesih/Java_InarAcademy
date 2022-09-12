package chapter.Chapter_05;

import java.util.Scanner;

public class C05E02 {

	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;

		String output = " ";
		Scanner input = new Scanner(System.in);
		while (count < NUMBER_OF_QUESTIONS) {
			int number1 = (int) (Math.random() * 15);
			int number2 = (int) (Math.random() * 15);
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			System.out.println("What is " + number1 + "-" + number2 + "?");
			int answer = input.nextInt();
			if (number1 - number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			} else
				System.out.println(
						"Your answer is wrong.\n" + +number1 + "-" + number2 + " should be " + (number1 - number2));

			count++;
			output += "\n" + number1 + "-" + number2 + "=" + answer
					+ ((number1 - number2 == answer) ? " correct" : " wrong");
		}
		System.out.println("\nCorrect count is " + correctCount);
		System.out.println(output);
	}
}
