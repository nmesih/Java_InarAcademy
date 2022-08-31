package chapter.Chapter_03;

import java.util.Scanner;

public class C03E30 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the time zone offset to GMT: ");
			
			int offset = input.nextInt();
			  // calculate offset in seconds
			  
			// Obtain the total milliseconds since midnight, Jan 1, 197
			long totalMilliseconds = System.currentTimeMillis();
			
			// Obtain the total seconds since midnight, Jan 1, 1970
			long totalSeconds = totalMilliseconds / 1000;
			
			// Compute the current second in the minute in the hour
			long currentSeconds = totalSeconds % 60;
			
			// Obtain the total minutes
			long totalMinutes = totalSeconds / 60;
			
			 // Compute the current minute in the hour
			long currentMinute = totalMinutes % 60;
			
			// Obtain the total hours
			long totalHours = totalMinutes / 60;
			
			// Compute the current hour
			long currentHour = totalHours % 24;
			
			currentHour = currentHour + offset;
			
			if (currentHour >= 12) {
				currentHour = currentHour - 12; 
				System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSeconds + " PM");
			
			} else if (0 < currentHour && currentHour < 12){
					System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSeconds + " AM");
			} else {
					System.out.println("Current time is " + -currentHour + ":" + currentMinute + ":" + currentSeconds + " AM");
			}
			
	}
}
