package chapter.Chapter_05;

public class C05E39 {

	public static void main(String[] args) {
		
		double goal = 0;
		double amount = 0;
		
		while(goal <= 30000) {
			if(amount <= 5000) {
				goal = amount + (amount * 0.08);
			}else if (5000 < amount && amount <= 10000) {
				goal = amount + ((amount - 5000) * 0.10) + (5000 * 0.08);
			}else if (10000 < amount) {
				goal = amount + ((amount - 10000) * 0.12) + (5000 * 0.10) + (5000 * 0.08);
			}
			amount++;
		}
		System.out.println("The minimum sales you need to generate to earn $30,000 is " + amount);
		
	}

}
