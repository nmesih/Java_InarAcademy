package chapter.Chapter_05;

import java.util.Scanner;

public class C05E45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		
		double sum = 0;
		double squareSum = 0;
		
		for (int i = 0; i < 10; i++) {
			double temp = input.nextDouble();
			sum += temp;
			squareSum += (temp * temp);
		}
		double mean = sum / 10.0;
		double sDeviation = Math.sqrt( ((squareSum) - ((sum * sum) / 10.0)) / 9.0);
		System.out.println("The mean is " + mean);
		System.out.println("The standart deviation is " + sDeviation);
	}

}
