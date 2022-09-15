package chapter.Chapter_05;

public class C05E24 {

	public static void main(String[] args) {
		double total = 0;
		
		for(int i=1; i <= 97; i += 2) {
			total += i / (i + 2.0);
		}
		System.out.println(total);
	}

}
