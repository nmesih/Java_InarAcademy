package chapter.Chapter_03;

import java.util.Scanner;

public class C03E14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a guess (0 for head, and 1 for tail): ");
		int coinFlip = (int)(Math.random() * 2);
		int guess = input.nextInt();
		
		if (coinFlip == guess) {
			System.out.println("Yes! You got it correct");
	}	else 
		System.out.println("No! You didn't know.");

	}
}