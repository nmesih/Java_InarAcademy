package chapter.Chapter_04;

import java.util.Scanner;

public class C04E25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Vehicle plate number ");
		int number = 65 + (int)(Math.random() * 26);
		char ch = (char)number;
		
		int number2 = 65 + (int)(Math.random() * 26);
		char ch2 = (char)number2;
		
		int number3 = 65 + (int)(Math.random() * 26);
		char ch3 = (char)number3;
		
		int x = (int)(Math.random() * 9000 + 1000);
		
		System.out.print("is " + ch + ch2 + ch3 + x);
		
	}

}
