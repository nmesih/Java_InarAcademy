package chapter.Chapter_05;

public class C05E03 {

	public static void main(String[] args) {
		int kg = 1;
		double pounds;
		System.out.println("Kilograms\t\tPounds");
		kg = 1;
		while (kg < 200) {
			pounds = kg * 2.2;
			System.out.println(kg + "\t\t\t" + (int)(pounds * 100)/100.00);
			kg += 2;
		
		}
	}

}
