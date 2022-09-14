package chapter.Chapter_05;

public class C05E18 {

	public static void main(String[] args) {
		patternA();
		patternB();
		patternC();
		patternD();
	}

	public static void patternA() {
		int n = 6;
		int total = 1;
		System.out.println("Pattern A");
		for (int i = 1; i <= 6; i++) {

			for (int k = 1; k <= total; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
			total += 1;
		}

	}

	public static void patternB() {
		int n = 7;
		System.out.println("\nPattern B");
		for (int i = 1; i <= 7; i++) {

			for (int k = 1; k <= (n - i); k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

	public static void patternC() {
		int n = 6;
		System.out.println("Pattern C");
		for (int i = 1; i <= 6; i++) {

			for (int k = 1; k <= (n - i); k++) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void patternD() {
		int n = 7;
		System.out.println("\nPattern D");
		for (int i = 1; i <= 7; i++) {
			for (int k = i; k>1; k--) {
			    System.out.print("  ");
			   }
			for (int k = 1; k <= (n - i); k++){
				
					System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}

