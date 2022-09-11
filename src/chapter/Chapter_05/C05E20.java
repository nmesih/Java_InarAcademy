package chapter.Chapter_05;

public class C05E20 {

	public static void main(String[] args) {

		System.out.println("Prime numbers between 2 and 1000 are \n");
		int count = 0;
		int number = 2;
		int NUMBER_OF_PRIMES_PER_LINE = 8;

		while (count < 168) {
			boolean isPrime = true;

			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}

			if (isPrime == true) {
				count++;

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}
			number++;
		}

	}
}