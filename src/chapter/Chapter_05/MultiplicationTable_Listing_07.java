package chapter.Chapter_05;

public class Listing_7 {

	public static void main(String[] args) {
		System.out.println("           Multiplication Table");
		System.out.print("    ");
		
		for(int j = 1; j < 10; j++) 
			System.out.print("   " + j);
			
		
		System.out.println("\n--------------------------------------------");
		
		for(int i = 1; i < 10;i++) {
			System.out.print(i + " | ");
			for(int j = 1; j < 10;j++) {
				System.out.printf("%4d", j * i);
			}
			System.out.println();
	}


	}
	}