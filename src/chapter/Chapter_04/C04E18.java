package chapter.Chapter_04;

import java.util.Scanner;

public class C04E18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two characters: ");
		String s = input.next();
		char ch = s.charAt(0);
		int lv = input.nextInt();
		String b = "";
		
		switch(ch) {
		case 'M': b = "Mathematics"; break;
		case 'C': b = "Computer Science"; break;
		case 'I': b = "Information Technology"; break;
		}
		
		String stu = "";
		
		switch (lv) {
		case 1: stu = "Freshman";break;
		case 2: stu = "Sophomore";break;
		case 3: stu = "Junior";break;
		case 4: stu = "Senior";break;
		}
		
		System.out.println(b + " " + stu);
		
	}

}
