package chapter.Chapter_05;

public class Checkpoint_13 {

	public static void main(String[] args) {
		forLoop();
		whileLoop();
		doWhileLoop();
		
	}
	public static void forLoop() {
		long sum = 0;
		for (int i = 0; i <= 1000; i++) {
		 sum = sum + i;
		}
		System.out.println(sum);
	}
	
	public static void whileLoop() {
		long sum = 0;
		int i = 0;
		while(i <= 1000) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
	}
	public static void doWhileLoop() {
		long sum = 0;
		int i = 0;
		do {
			sum += i;
			i++;
		} while(i <= 1000);
		System.out.println(sum);
	}
}
