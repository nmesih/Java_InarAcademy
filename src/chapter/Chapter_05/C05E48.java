package chapter.Chapter_05;

import java.util.Scanner;

public class C05E48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		String a = "";
		
		for(int i = 0; i < s.length(); i++ ) {
			if(i % 2 == 0) {
				a += s.charAt(i);
			}
		}
		System.out.println(a);
	}

}
