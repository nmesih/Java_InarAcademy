package chapter.Chapter_04;

import java.util.Scanner;

public class C04E08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code(an integer between 0 and 127): ");
		byte numb = input.nextByte();
		
		System.out.println("The character for ASCII code " + numb + " is " + (char)numb);
		
	}

}
