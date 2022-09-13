package chapter.Chapter_05;

public class C05E13 {

	public static void main(String[] args) {
		int a = 1;
		  while (Math.pow(a, 3) <= 12000) {
		   a++;
		  }
		  int n = a-1;
		  System.out.println("The n is " + n);
		  System.out.println("The n^3 is " + Math.pow(n, 3));
	}

}
