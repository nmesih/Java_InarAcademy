package chapter.Chapter_05;

public class C05E07 {

	public static void main(String[] args) {
		double total = 0;
		double tuition = 10_000;
		int year = 0;
		while (year < 14) {
			tuition += tuition * 0.05;
			if (year == 9) {
				System.out.printf("Tuition in 10 years: %.2f", tuition);
			}
			if (year >= 10) {
				total += tuition;
			}
			if (year == 13) {

				System.out.printf("\nAfter 10 years 4 years of tuition will cost %.2f", total);
			}
			year++;
		}
	}

}
