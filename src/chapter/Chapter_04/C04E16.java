package chapter.Chapter_04;

public class C04E16 {

	public static void main(String[] args) {
		int number = 65 + (int)(Math.random() * 26);
		
		char ch = (char)number;
		System.out.println("The random letter is " + ch);
}
}