package chapter.Chapter_05;

public class C05E26 {

	public static void main(String[] args) {
		double e = 1;
		double d = 1;
		for (int i = 1; i <= 100000; i++) {
			d = d / i;	
			e += d;
			if(i == 10000) {
				System.out.println("i=10000 for e = " + e);
			} else if (i==20000) {
				System.out.println("i=20000 for e = " + e);
			}
		}
		System.out.println("i=100000 for e = " + e);
	}

}
