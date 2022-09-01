package chapter.Chapter_04;

import java.util.Scanner;

public class C04E02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radX1 = Math.toRadians(x1);
		double radY1 = Math.toRadians(y1);

		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radX2 = Math.toRadians(x2);
		double radY2 = Math.toRadians(y2);

		double distance = 6371.01 * Math.acos(Math.sin(radX1) * Math.sin(radX2) + Math.cos(radX1) * Math.cos(radX2) * Math.cos(radY1 - radY2));
		
		System.out.println("The distance between the two points is " + distance + " km");
	}

}
