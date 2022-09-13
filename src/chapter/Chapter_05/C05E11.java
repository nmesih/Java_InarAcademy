package chapter.Chapter_05;

public class C05E11 {

	public static void main(String[] args) {
		System.out.println("Numbers of divisible by 5 or 6, but not both: \n");
		int a = 0;
		for (int i = 100; i < 200; i++) {
			if (i % 5 == 0 ^ i % 6 == 0) {
				System.out.print(i + " ");
				a += 1;

				if (a == 10) {
					System.out.println("\n");
					a = 0;
				}

			}
		}
	}
}