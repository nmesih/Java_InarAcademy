package chapter.Chapter_03;

import java.util.Scanner;

public class C03E28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
		double r1x = input.nextDouble();
		double r1y = input.nextDouble();
		double r1Widht = input.nextDouble();
		double r1Height = input.nextDouble();
		r1Widht /= 2;
		r1Height /= 2;

		System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
		double r2x = input.nextDouble();
		double r2y = input.nextDouble();
		double r2Widht = input.nextDouble();
		double r2Height = input.nextDouble();
		r2Widht /= 2;
		r2Height /= 2;

		// Calculating range of r1 and r2
		double x1max = r1x + r1Widht;
		double y1max = r1y + r1Height;
		double x1min = r1x - r1Widht;
		double y1min = r1y - r1Height;
		double x2max = r2x + r2Widht;
		double y2max = r2y + r2Height;
		double x2min = r2x - r2Widht;
		double y2min = r2y - r2Widht;

		if (x1max <= x2max && x1min >= x2min && y1max <= y2max && y1min >= y2min) {
			System.out.print("r1 is inside r2");
		} else if (x2max <= x1max && x2min >= x1min && y2max <= y1max && y2min >= y1min) {
			System.out.print("r2 is inside r1");
		} else if (x1max < x2min || x1min > x2max || y1max < y2min || y1min > y2max) {
			System.out.print("r2 does not overlaps r1");
		} else {
			System.out.print("r2 overlaps r1");
		}

	}

}
