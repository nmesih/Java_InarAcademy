package chapter.Chapter_05;

public class Checkpoint_19 {

	public static void main(String[] args) {
		int count=0;
		for (int i = 0; i < 10; i++) { 
			for (int j = 0; j < i; j++) {
			 System.out.println(i * j);
			 count++;
			}
	}
		System.out.println("Count is " + count);
	}
}
