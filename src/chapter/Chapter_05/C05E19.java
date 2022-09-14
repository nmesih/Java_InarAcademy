
package chapter.Chapter_05;

public class C05E19 {

	public static void main(String[] args) {
		int n = 8;
		for (int i = 1; i <= 8; i++) {

			for (int k = 1; k <= (n - i); k++) {
				System.out.print("     ");
			}
			// for (int j = i; j >= 9; j--) {
			// System.out.print(j + " ");
			// }

			for (int k = 0; k < i; k++) {
				System.out.printf("%5d", (int) Math.pow(2, k));
			}
			for (int k = i - 2; k >= 0; k--) {
				System.out.printf("%5d", (int) Math.pow(2, k));
			}
			System.out.println();
		}
		
	}
}