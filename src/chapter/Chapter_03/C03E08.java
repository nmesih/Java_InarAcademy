package chapter.Chapter_03;

import java.util.Scanner;

public class C03E08 {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter three integers: ");
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			
			int min = 0;
			int med = 0;
			int max = 0;
			
			if ( a < b) {
				min = a;
				max = b;
			} else {
				min = b;
				max = a;
			}
			
			// a = 3  b = 1  c = 8 , 2 , 0
			// min = 1  max = 3
			
			if ( max < c) {
				med = max;
				max = c;
				//max = c;
			} else {
				// a = 3  b = 1  c = 2 , 0 
				// min = 1  max = 3
				
				if (min < c) {
					med = c;	
				} else  {
					med = min;
					min = c;
					
				}
			}
		//med = 1, min = 0, max = 3
		
		// min = 1, med =3,  max =8 

		System.out.println("min :" + min);
		System.out.println("med :" + med);
		System.out.println("max :" + max);
	}
		}


