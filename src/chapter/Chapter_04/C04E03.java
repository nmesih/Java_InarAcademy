package chapter.Chapter_04;

import java.util.Scanner;

public class C04E03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Atlanta : 33.75 , -84.38 
		//Orlando : 28.53 , -81.37
		//Savannah: 32.07 , -81.08
		//Charlotte: 35.22 , -80.84
		
		System.out.println("Press 1 to see the area surrounded by 4 cities: ");
		int a = input.nextInt();
		
		double ax = 33.75;
		double ay = -84.38;
		
		double ox = 28.53;
		double oy = -81.37;
		
		double sx = 32.07;
		double sy = -81.08;
		
		double cx = 35.22;
		double cy = -80.84;
		
		//4 şehrin çevrelediği alanı 2 üçgene bölüyoruz. İlk üçgen a-o-s üçgeninin alanı
		double side1 = Math.sqrt(Math.pow(ax - ox, 2) + Math.pow(ay - oy, 2));
		double side2 = Math.sqrt(Math.pow(ox - sx, 2) + Math.pow(oy - sy, 2));
		double side3 = Math.sqrt(Math.pow(ax - sx, 2) + Math.pow(ay - sy, 2));
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		//ikinci üçgenin alanını buluyoruz a-s-c
		double side11 = Math.sqrt(Math.pow(ax - sx, 2) + Math.pow(ay - sy, 2));
		double side22 = Math.sqrt(Math.pow(cx - sx, 2) + Math.pow(cy - sy, 2));
		double side33 = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2));
		double s2 = (side11 + side22 + side33) / 2;
		
		double area2 = Math.sqrt(s2 * (s2 - side11) * (s2 - side22) * (s2 - side33));
		
		System.out.println("The area enclosed by 4 cities is " + (area + area2));
		
	}

}
