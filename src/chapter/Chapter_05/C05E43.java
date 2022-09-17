package chapter.Chapter_05;

public class C05E43 {

	public static void main(String[] args) {
		int total = 0;
		int a = 0;
		int b = 0;
		
		for(a = 1; a <= 7; a++) {
			for(b = a + 1; b <= 7; b++) {
				System.out.println(a + " " + b);
				total++;
		}
	}
		System.out.println("The total number of all combinations is " + total);
	}
	}
