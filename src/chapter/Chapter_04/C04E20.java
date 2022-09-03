package chapter.Chapter_04;

import java.util.Scanner;

public class C04E20 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		  System.out.println("Enter a string: ");
		  String a = input.next();
		  
		  System.out.println("Length of entered string is " + a.length() + ". First letter is " + a.charAt(0) + ".");
		  
	}

}
