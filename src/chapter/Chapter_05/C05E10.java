package chapter.Chapter_05;

public class C05E10 {

	public static void main(String[] args) {
		System.out.println("Numbers between 100 and 1000 divisible by 5 and 6: \n");
		int a = 0;
		for(int i=100; i < 1000;i++) {
			if(i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
				a += 1;
				
				if(a == 10) {
					System.out.println("\n");
					a = 0;
				}
			}
		}
	}

}
