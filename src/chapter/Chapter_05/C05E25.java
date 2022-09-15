package chapter.Chapter_05;

public class C05E25 {

	public static void main(String[] args) {
		double total = 0;

		for (int i = 1; i <= 100000; i++) {
			total += Math.pow(-1, i+1) / (2 * i - 1.0);
		}
		System.out.println(4 * total);
	}

}
//PI at:

//10000 ----> 3.1414926535900345
//20000 ----> 3.1415426535898248
//30000 ----> 3.1415826535897198