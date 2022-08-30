package chapter.Chapter_03;

import java.util.Scanner;

public class C03E21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year: (e.g., 2012): ");
		int y = input.nextInt();
		System.out.println("Enter month: 1-12: ");
		int m = input.nextInt();
		System.out.println("Enter the day of the month: 1-31: ");
		int d = input.nextInt();
		
		String H = " ";
		
		int j = (y / 100);
		int k = y % 100;
		
		int h = (d + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7; 
		
		if (m == 1) {
			m = 13;
		}
		if (m == 2) {
			m = 14;
		}
		
		switch (h) {
		case 0: H = "Saturday"; break;
		case 1: H = "Sunday"; break;
		case 2: H = "Monday"; break;
		case 3: H = "Tuesday"; break;
		case 4: H = "Wednesday"; break;
		case 5: H = "Thursday"; break;
		case 6: H = "Friday"; break;
		}
		
		System.out.println("Day of the week is " + H);
	
	
	
	
	
	
	}
}	