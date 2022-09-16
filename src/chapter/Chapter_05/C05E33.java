package chapter.Chapter_05;

public class C05E33 {

	public static void main(String[] args) {
		int perfectNumber = 0;
		int a = 0;
		for(int i = 1; i < 10000; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					a += j;
				}
			}
			if (a == i) {
				System.out.println(i + " is perfect number");
				perfectNumber++;
			}
			a = 0;
		}
		System.out.println("Number of perfect numbers: " + perfectNumber);
	}

}
