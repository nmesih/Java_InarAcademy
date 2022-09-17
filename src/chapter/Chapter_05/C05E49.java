package chapter.Chapter_05;

import java.util.Scanner;

public class C05E49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		int vowel=0;
		int consonants=0;
		s = s.toUpperCase();
	
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				vowel++;
			} else if (s.charAt(i)==' '){
			} else {
				consonants++;
			}
		}
		
		System.out.println("The number of vowels is " + vowel);
		System.out.println("The number of consonants is " + consonants);
	}

}
