package chapter.Chapter_05;

public class Checkpoint_24A {

	public static void main(String[] args) {
		int balance = 10;
		while (true) {
		if (balance < 9)
		break;
		 balance = balance - 9;
		}
		System.out.println("Balance is "+ balance);
	}

}
