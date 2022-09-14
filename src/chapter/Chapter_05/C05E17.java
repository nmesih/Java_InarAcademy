package chapter.Chapter_05;

public class C05E17 {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= 7; i++) {

			for (int k = 1; k <= (n - i); k++) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}
}