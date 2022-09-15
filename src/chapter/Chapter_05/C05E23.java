package chapter.Chapter_05;

public class C05E23 {

	public static void main(String[] args) {
		int n = 50000;
		double totalRight = 0;
		double totalLeft = 0;
		for(int i=2; i <= n; i++) {
			totalLeft += 1.0 / i;
			totalRight += 1.0 / (n-i+1);
			
		}
		System.out.println(totalRight);
		System.out.println(totalLeft);
	}

}
