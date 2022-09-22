package chapter.Chapter_05;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int a = 1;
		int numberOfPositives = 0;
		int numberOfNegatives = 0;
		double total = 0;
		
		while(a != 0) {
			a = input.nextInt();
			if(a > 0) {
				numberOfPositives++;
			}else if (a < 0){
				numberOfNegatives++;
			}
			total +=a; 
		}
		System.out.println("The number of positives is " + numberOfPositives);
		System.out.println("The number of negatives is " + numberOfNegatives);
		System.out.println("The total is " + total);
		System.out.println("The average is " + (total/(numberOfNegatives+numberOfPositives)));
	}

}
