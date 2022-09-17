package chapter.Chapter_05;

import java.util.Scanner;

public class C05E41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers ");
		int a;
		int max=0;
		int count=0;
		
		while((a = input.nextInt()) != 0) {
			if(a > max) {
				max = a;
				count = 1;
			} else if (a == max) {
				count++;
			}
		
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
		
	}

}
