package chapter.Chapter_05;

public class C05E05 {

	public static void main(String[] args) {

		System.out.printf("%-9s%16s", "Kilograms", "Pounds");
		System.out.print("\t|\t");
		System.out.printf("%-9s%16s\n", "Pounds", "Kilograms");

		for (int pounds = 0, kg = 1; kg < 200; kg += 2, pounds += 5) {
			System.out.printf("%-9d%16.1f", kg, kg * 2.2);
			System.out.print("\t|\t");
			System.out.printf("%-9d%16.2f\n", 20 + pounds, (20 + pounds) / 2.2);

		}
	}
}
