package chapter.Chapter_02;

import java.util.Scanner;

public class C02E07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes: ");
		
		long minutes = input.nextLong();
		int hours = (int) minutes / 60;
		int days = hours /24;
		int years = days / 365;
		days %= 365;
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
		
	}

}
