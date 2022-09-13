package chapter.Chapter_05;

public class C05E06 {

	public static void main(String[] args) {

		System.out.printf("%-9s%15s", "Miles", "Kilometers");
		System.out.print("\t|\t");
		System.out.printf("%-9s%15s\n", "Kilometers", "Miles");

		for (int km = 0, miles = 1; miles < 11; miles++, km += 5) {
			System.out.printf("%-9d%15.3f", miles, miles * 1.609);
			System.out.print("\t|\t");
			System.out.printf("%-11d%15.3f\n", 20 + km, (20 + km) / 1.609);

		}
	}

}
