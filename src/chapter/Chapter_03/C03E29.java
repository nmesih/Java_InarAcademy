 package chapter.Chapter_03;

import java.util.Scanner;

public class C03E29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter circle1's center x-, y-coordinates and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double rad1 = input.nextDouble();

		System.out.println("Enter circle2's center x-, y-coordinates and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double rad2 = input.nextDouble();

		double d = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);

		if (d <= Math.abs(rad2 - rad1)) {
			if (rad2 < rad1) {
				System.out.print("circle2 is inside circle1");
			} else if (rad1 < rad2) {
				System.out.print("circle1 is inside circle2");
			} else {
				System.out.print("circle2 is indentical to circle1");
			}
			
		} else if (d < rad2 + rad1) {
			System.out.print("circle2 overlaps circle1 ");
		} else if (d >= rad2 + rad1) {
			System.out.print("circle2 does not overlap circle1 ");
		}

	}
}
