package chapter.Chapter_05;

public class C05E20 {

	public static void main(String[] args) {

		System.out.println("Prime numbers between 2 and 1000 are: \n");
		int count = 0;
		int number = 2;
		int NUMBER_OF_PRIMES_PER_LINE = 8;

		while (number < 1000) {
			boolean isPrime = true;

			for (int bolen = 2; bolen <= number / 2; bolen++) {
				if (number % bolen == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				count++;

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.printf("%4d\n" , number);
				} else {
					System.out.printf("%4d" , number);
				}
			}
			number++;
		}
	}
}