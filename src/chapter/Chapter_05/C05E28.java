package chapter.Chapter_05;

import java.util.Scanner;

public class C05E28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.println("Enter the day: ");
		int d = input.nextInt();
		
		String sMonth = "";
		String sDay = "";
		
		for (int month = 1; month <= 12; month++) {
			
			int length = 0;
			if(month == 4 || month == 6 || month == 9 || month == 11){
				length = 30; 
			} else if (month == 2) {
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					length = 29;
				} else {
					length = 28;
				}
			} else 
				length = 31;
			
			 switch (month) {
			   case 1: sMonth = "January"; break;
			   case 2: sMonth = "February"; break;
			   case 3: sMonth = "March"; break;
			   case 4: sMonth = "April"; break;
			   case 5: sMonth = "May"; break;
			   case 6: sMonth = "June"; break;
			   case 7: sMonth = "July"; break;
			   case 8: sMonth = "August"; break;
			   case 9: sMonth = "September"; break;
			   case 10: sMonth = "October"; break;
			   case 11: sMonth = "November"; break;
			   case 12: sMonth = "December"; break;
			   default:
			    sMonth = "";
			   }
			 			 
			   d = d % 7;
			 
			   switch (d) {
			   case 1: sDay = "Monday"; break;
			   case 2: sDay = "Tuesday"; break;
			   case 3: sDay = "Wednesday"; break;
			   case 4: sDay = "Thursday"; break;
			   case 5: sDay = "Friday"; break;
			   case 6: sDay = "Saturday"; break;
			   case 0: sDay = "Sunday"; break;
			   default:
			    sDay = "";
			   }
			   
			   d += length;
			   System.out.println(sMonth + " 1, " + year + " is " + sDay);	
		}
	}
}
