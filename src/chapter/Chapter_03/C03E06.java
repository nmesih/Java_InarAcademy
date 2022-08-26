package chapter.Chapter_03;

import java.util.Scanner;

public class C03E06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
				
		System.out.println("Enter feet:");
		double feet = input.nextDouble();
		
		System.out.println("Enter inches: ");
		double inches = input.nextDouble();
		
		inches += feet * 12;
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = inches * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.println("BMI is " + bmi);
		  if (bmi < 18.5) {
		   System.out.println("Underweight");
		 } else if (bmi < 25) {
		   System.out.println("Normal");
		 } else if (bmi < 30) {
		   System.out.println("Overweight");
		 }  else
		   System.out.println("Obese");
		 }
		
}
