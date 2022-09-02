package chapter.Chapter_04;

import java.util.Scanner;

public class C04E14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		String lg = input.next();
		  
		char ch = Character.toUpperCase(lg.charAt(0));
		lg = "FDCBA";
		int value = lg.lastIndexOf(ch);
		if (value < 5 && value != -1) {
			System.out.println("The numeric value for grade " + ch + " is " + value);
		} else  {
			System.out.println(ch + " is an invalid grade.");
		}
		
		
	}

}
