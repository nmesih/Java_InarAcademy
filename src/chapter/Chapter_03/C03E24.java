package chapter.Chapter_03;

import java.util.Scanner;

public class C03E24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a card.");
		System.out.println("Press 1 to see the card you selected.");
		int x = input.nextInt();
		int rank = (int)(Math.random() * 13) + 1;
		int suit = (int)(Math.random() * 4) + 1;
		
		String sRank = " ";
		
		switch (rank) {
		case 1: sRank = "Ace"; break;
		case 2: sRank = "2"; break;
		case 3: sRank = "3"; break;
		case 4: sRank = "4"; break;
		case 5: sRank = "5"; break;
		case 6: sRank = "6"; break;
		case 7: sRank = "7"; break;
		case 8: sRank = "8"; break;
		case 9: sRank = "9"; break;
		case 10: sRank = "10"; break;
		case 11: sRank = "Jack"; break;
		case 12: sRank = "Quenn"; break;
		case 13: sRank = "King"; break;
		}
		
		String sSuit = " ";
		
		switch (suit) {
		case 1: sSuit = "Clubs";break;
		case 2: sSuit = "Diamonds";break;
		case 3: sSuit = "Hearts";break;
		case 4: sSuit = "Spades";break;
	 }
		System.out.print("The card you picked is " + sRank +" of " + sSuit );
		
		
	}

}
