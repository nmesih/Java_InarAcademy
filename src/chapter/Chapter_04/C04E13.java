package chapter.Chapter_04;

import java.util.Scanner;

public class C04E13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String a = input.next();
		char ch = a.charAt(0);
		
		if ((int)ch < 65 || (90 < (int)ch && (int)ch < 97) || 122 < (int)ch ) {
			System.out.println(ch + " is a invalid input.");
		} else if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' 
				|| ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
			System.out.println(ch + " is a vowel.");
		} else {
			System.out.println(ch + " is a consonanat.");
		}
	}

}
