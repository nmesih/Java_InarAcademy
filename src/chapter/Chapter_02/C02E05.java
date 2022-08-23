package chapter.Chapter_02;

import java.util.Scanner;

public class C02E05 {

	public static void main(String[] args) {
		
		System.out.println("Enter the subtotal and a gratuity rate: ");
		
		double gratuityRate,
				gratuityTotal,
				total,
				subtotal;
		
		Scanner input = new Scanner(System.in);
		
		subtotal = input.nextDouble();
		gratuityRate = input.nextDouble();
		
		gratuityTotal = subtotal * gratuityRate * .01;
		total = subtotal + gratuityTotal;
		
		System.out.println("The gratuity is $" + gratuityTotal + " and total is $" + total);
		
		
	}

}
