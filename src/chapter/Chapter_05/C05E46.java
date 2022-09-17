package chapter.Chapter_05;

import java.util.Scanner;

public class C05E46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		String a = "";
		int k = s.length();
		for(int i = k - 1; i >= 0;i--) {
				a += s.charAt(i);
			}
			System.out.println(a);
		}
	

}
