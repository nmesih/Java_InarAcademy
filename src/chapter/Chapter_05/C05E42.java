package chapter.Chapter_05;

import java.util.Scanner;

public class C05E42 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter commission sought");
		double COMMISSION_SOUGHT = input.nextDouble();
		double amount = 0;
		
		for (amount=0; COMMISSION_SOUGHT <= 30000; amount++) {
			if(amount <= 5000) {
				COMMISSION_SOUGHT = amount + (amount * 0.08);
			}else if (5000 < amount && amount <= 10000) {
				COMMISSION_SOUGHT = amount + ((amount - 5000) * 0.10) + (5000 * 0.08);
			}else if (10000 < amount) {
				COMMISSION_SOUGHT = amount + ((amount - 10000) * 0.12) + (5000 * 0.10) + (5000 * 0.08);
			}
		}
		System.out.println("The minimum sales you need to generate to earn $" + (int)COMMISSION_SOUGHT + " is " + amount);
	} 
		
}
