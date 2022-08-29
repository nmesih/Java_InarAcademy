package chapter.Chapter_03;

import java.util.Scanner;

public class C03E15 {

	/**
	 * Kullanıcı - 100-999 arası sayı
	 * 1- kullanıcı = lottery - 10.000 $ 
	 * 2- kullanıcının sayısı ile lotterydeki sayı basamakları aynı olacak ama dizilişleri farklı olacak. 123 - 132 -231 - 213 - 312 - 321
	 * 	102 = 120 - 210 - 201
	 *  123 =  132 , 231 , 213 , 312 , 321
	 *  (l1 == i1 || l1 == i2 || l1 == i3) && (l2 == i1 || l2 == i2 || l2 == i3) && (l3 == i1 || l3 == i2 || l3 == i3)
	 *  3- Kullanıcının sayısı ile lotterydeki sayının bir basamağı aynı ise $1000
	 *  (l1 == i1 || l1 == i2 || l1 == i3) || (l2 == i1 || l2 == i2 || l2 == i3) || (l3 == i1 || l3 == i2 || l3 == i3)
	 *  
	 *  lottery = 188
	 *  input = 811 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int lottery = (int)(Math.random() * 900) + 100;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (three digit):");
		
		int guess = input.nextInt();
		//Get digits from lottery
		int lotDig1 = lottery / 100;
		int lotDig2 = (lottery % 100) / 10;
		int lotDig3 = lottery % 10;
		
		 //Get digits from guess
		int gueDig1 = guess / 100;
		int gueDig2 = (guess % 100) / 10;
		int gueDig3 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		if (guess == lottery) {
			System.out.println("Exact match: you win $10000");
		} else if ((gueDig1 == lotDig2 && gueDig2 == lotDig1 && gueDig3 == lotDig3)
			|| (gueDig1 == lotDig1 && gueDig2 == lotDig3 && gueDig3 == lotDig2)
			|| (gueDig1 == lotDig3 && gueDig2 == lotDig2 && gueDig3 == lotDig1)
			|| (gueDig1 == lotDig2 && gueDig2 == lotDig3 && gueDig3 == lotDig1)
			|| (gueDig1 == lotDig3 && gueDig2 == lotDig1 && gueDig3 == lotDig2)) {
			System.out.println("Match all digits: you win $3000");
		}	else if (gueDig1 == lotDig1 || gueDig1 == lotDig2 || gueDig1 == lotDig3 
				|| gueDig2 == lotDig1 || gueDig2 == lotDig2 || gueDig2 == lotDig3
				|| gueDig3 == lotDig1 || gueDig3 == lotDig2 || gueDig3 == lotDig3) {
			System.out.println("Match one digit: you win $1000");
		} 	else {
				System.out.println("Sorry, no match.");
		}
	}	
}