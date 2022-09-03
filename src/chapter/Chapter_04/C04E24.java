package chapter.Chapter_04;

import java.util.Scanner;

public class C04E24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();
		
		String a = "The three cities in alphabetical order are "; 
		
		if (city1.compareTo(city2) < 0 && city2.compareTo(city3) < 0) {
		System.out.println(a + city1 + " " + city2 + " " + city3);
		} else if (city1.compareTo(city3) < 0 && city3.compareTo(city2) < 0) {
			System.out.println(a + city1 + " " + city3 + " " + city2);
		} else if (city2.compareTo(city1) < 0 && city1.compareTo(city3) < 0) {
			System.out.println(a + city2 + " " + city1 + " " + city3);
		} else if (city2.compareTo(city3) < 0 && city3.compareTo(city1) < 0) {
			System.out.println(a + city2 + " " + city3 + " " + city1);
		} else if (city3.compareTo(city1) < 0 && city1.compareTo(city2) < 0) {
			System.out.println(a + city3 + " " + city1 + " " + city2);
		} else {
			System.out.println(a + city3 + " " + city2 + " " + city1);
		}
		
		
		
		
		/*if (city1.compareToIgnoreCase(city2) < 0) {
			temp = city2;
			city2 = city1;
			city1 = temp;
		}
		if (city2.compareToIgnoreCase(city3) < 0) {
			temp = city3;
			city3 = city2;
			city2 = temp;
		}
		if (city3.compareToIgnoreCase(city1) < 0) {
			temp = city1;
			city1 = city3;
			city3 = temp;
		}
		System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
		
		*/
	}

}
