package chapter.Chapter_05;

import java.util.Scanner;

public class C05E37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int a = input.nextInt();
		String s = "";
		
		while(a != 0) {
			s = a % 2 + s;
			a = a/2;
		}
		System.out.println("The binary form is " + s);
	}
	}


