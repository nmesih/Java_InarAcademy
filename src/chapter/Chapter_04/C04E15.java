package chapter.Chapter_04;

import java.util.Scanner;

public class C04E15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String l = input.next();
		char ch = l.toLowerCase().charAt(0);

		String a = "The corresponding number is ";
		if (ch == 'a' || ch == 'b' || ch == 'c') {
			System.out.println(a + 2);
		} else if (ch == 'd' || ch == 'e' || ch == 'f') {
			System.out.println(3);
		} else if (ch == 'g' || ch == 'h' || ch == 'i') {
			System.out.println(a + 4);
		} else if (ch == 'j' || ch == 'k' || ch == 'l') {
			System.out.println(a + 5);
		} else if (ch == 'm' || ch == 'n' || ch == 'o') {
			System.out.println(a + 6);
		} else if ('p' <= ch && ch <= 's') {
			System.out.println(a + 7);
		} else if (ch == 't' || ch == 'u' || ch == 'v') {
			System.out.println(a + 8);
		} else if ('w' <= ch && ch <= 'z') {
			System.out.println(a + 9);
		} else {
			System.out.println(ch + " is an invalid input");
		}
	}

}