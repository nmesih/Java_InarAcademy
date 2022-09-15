package chapter.Chapter_05;

public class C05E27 {

	public static void main(String[] args) {
		
		int line = 0;
		for(int year = 101; year < 2100; year++) {
			
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.print(year + "  ");
				line++;
				if (line % 10 == 0) {
					System.out.println();
				}
			} 
		}
		System.out.println("\nThe number of leap years between 101 and 2100 is " + line);
	}

}
