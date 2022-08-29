package chapter.Chapter_03;

import java.util.Scanner;

public class C03E12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a three-digit integer: ");
		int numb = input.nextInt();
		
		int first = numb / 100;
		int last = numb % 10;
		
		if (first == last
				) {
			System.out.println(numb +  " is a palindrome.");	
		}
		else {
		System.out.println(numb + " is not a palindrome.");
	}
	}
}
