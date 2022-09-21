package chapter.Chapter_05;

public class Exercise_07 {

	public static void main(String[] args) {
		// (Financial application: compute future tuition)
		int tuition = 10000;
		double rate = 0.05;
		int total = 0;
		for (int year = 1; year <= 14; year++) {
			tuition += tuition * rate;
			if (year <= 10) {
				System.out.println("The tuition fee after " + year + " year is $" + tuition);
			} 
			if (10 < year) {
				total += tuition;
			} 
			if (year == 14 ) {
				System.out.println("The four-year tuition fee after the tenth year " + total);
			}
		}
	}
}
