package chapter.Chapter_03;

import java.util.Scanner;

public class C03E10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    int number1 = (int)(Math.random() * 100);
	    int number2 = (int)(Math.random() * 100);
	 
	 
	    System.out.println("What is " + number1 + " + " + number2 + "? ");
	    
	    int answer = input.nextInt();
	 
	    if (number1 + number2 == answer) {
	      System.out.println("You are correct!");
	    } else {
	      System.out.println("Your answer is wrong.");
	      System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
	  }
	
	}
}

