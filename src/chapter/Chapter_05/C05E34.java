package chapter.Chapter_05;

import java.util.Scanner;

public class C05E34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome the scissor-rock-paper game!");
		int computerWinCount = 0;
		int userWinCount = 0;
		System.out.println("scissor (0), rock (1), paper (2):");
		while (Math.abs(computerWinCount - userWinCount) <= 2) {
			int userChoice = input.nextInt();
			int computerChoice = (int) (Math.random() * 3);
			if (computerChoice - userChoice == 1 || computerChoice - userChoice == -2) {
				System.out.println("Computer won");
				computerWinCount++;
				continue;
			} else if (computerChoice - userChoice == -1 || computerChoice - userChoice == 2) {
				System.out.println("You won");
				userWinCount++;
				continue;
			} else {
				System.out.println("It's a draw.");
			}
		}
		if (computerWinCount > userWinCount) {
			System.out.println("Game over! You lose.");
		} else {
			System.out.println("Game over! You won.");
		}

	}

}
