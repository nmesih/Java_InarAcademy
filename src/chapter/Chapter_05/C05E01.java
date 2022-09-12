package chapter.Chapter_05;

import java.util.Scanner;

public class C05E01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int number = 0, posnum = 0, negnum = 0;
		double average = 0;
		double sum = 0;
		while (true) {
			number = input.nextInt();
			sum += number;

			if (number > 0) {
				posnum++;
			} else if (number < 0) {
				negnum++;
			}
			if (number == 0)
				break;
		}
		if (number == 0 && posnum == 0 && negnum == 0) {
			System.out.println("No numbers are entered except 0.");
		} else {
			System.out.println("The number of positives is " + posnum);
			System.out.println("The number of negatives is " + negnum);
			System.out.println("The total is " + sum);
			average = sum / (negnum + posnum);
			System.out.println("The average is " + average);
		}
	}

}