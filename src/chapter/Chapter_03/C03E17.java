package chapter.Chapter_03;

import java.util.Scanner;

public class C03E17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("scissor (0), rock (1), paper (2)? ");
		int comp = (int)(Math.random() * 3);
		int choice = input.nextInt();
		
		String strComp = "";
		
		switch (comp) {
		  case 0: strComp = "scissor"; break;
		  case 1: strComp = "rock"; break;
		  case 2: strComp = "paper"; break;
		  }
		 
		  String strChoice = "";
		switch (choice) {
		  case 0: strChoice = "scissor"; break;
		  case 1: strChoice = "rock"; break;
		  case 2: strChoice = "paper"; break;
		  }
		  
		if (comp == choice) {
			System.out.println("The computer is " + strComp + ". You are "
				    + strChoice + ". It's a draw.");
		}	else if (comp - choice == 1 || comp - choice == -2) {
			System.out.println("The computer is " + strComp + ". You are "
				    + strChoice + ". The computer won.");
		}	else if (comp - choice == -1 || comp - choice == 2) {
			System.out.println("The computer is " + strComp + ". You are "
				    + strChoice + ". You won.");
		}

	}		
}
