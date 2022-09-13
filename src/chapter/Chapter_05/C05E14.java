package chapter.Chapter_05;

import java.util.Scanner;

public class C05E14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int i = input.nextInt();
		int a = input.nextInt();
		
		int temp;
		// i: 12 a:8 temp:0
		if(a < i) {
			temp = a; 
			a = i;
			i = temp;
		}
		boolean b = true;
		
		for(int d = i; b; d--) {
			if(i % d == 0 && a % d == 0) {
				System.out.println("The GCD is: " + d);
				break;
			}
		}
	}

}
