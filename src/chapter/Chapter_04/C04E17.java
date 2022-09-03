package chapter.Chapter_04;

import java.util.Scanner;

public class C04E17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		System.out.println("Enter a month with the first letter uppercase(first three letters of a month name):");
		String month = input.next();
		char ch = month.charAt(0);
		
		
		int days = 0;
		
		switch (month) {
		  case "Feb":
		   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		    days = 29;
		    break;
		   }
		   days = 28;
		   break;
		 
		  case "Apr":
		  case "Jun":
		  case "Sep":
		  case "Nov":
		   days = 30;
		   break;
		 
		  case "Jan":
		  case "Mar":
		  case "May":
		  case "Jul":
		  case "Aug":
		  case "Oct":
		  case "Dec":
		   days = 31;
		   break;
	}
		System.out.println(month + " " + year + " has " + days + " days.");

}
}