package chapter.Chapter_04;

import java.util.Scanner;

public class C04E09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String a = input.next();
		char ch = a.charAt(0);
		
		System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
		
	}

}
