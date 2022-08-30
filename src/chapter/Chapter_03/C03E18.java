package chapter.Chapter_03;

import java.util.Scanner;

public class C03E18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the weight of the packege: ");
		double pack = input.nextDouble();
		
		if (0 < pack && pack <= 1) {
			System.out.println("The shipping cost is " + 3.5 + " dolars.");
		} else if (1 < pack && pack <= 3) {
			System.out.println("The shipping cost is " + 5.5 + " dolars.");
		} else if (3 < pack && pack <= 10) {
			System.out.println("The shipping cost is " + 8.5 + " dolars.");
		} else if (10 < pack && pack <= 20) {
			System.out.println("The shipping cost is " + 10.5 + " dolars.");
        } else if (50 < pack)  {
        	System.out.println("The package cannot be shipped.");
        }
 }
}