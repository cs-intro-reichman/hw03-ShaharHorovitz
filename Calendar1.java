/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    //int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
		int sundays = 0;
	 	while (year != 2000) 
	 	{
	 		//// Write the body of the while 		
	 		sundays+=advance(dayOfMonth, month, year);
			year++;
	 		//debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		//if (debugDaysCounter==1) { 
	 			//break;
	 		//}
        	}
		System.out.println("During the 20th century, " + sundays + " Sundays fell on the first day of the month");
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static int advance(int day, int month, int year) {
		 int sundays = 0;
	 	for(int i =1; i<=12; i++)
	 	{ 
	 		for (int j = 1; j<=nDaysInMonth(i,year); j++)
	 		{
	 			if (dayOfWeek == 1)
	 			{
					if (j ==1)
	 				{
	 					sundays++;
	 				}
	 				//System.out.println(j + "/" +month +"/" + year + " Sunday");
	 				dayOfWeek++;
	 			}
	 			else if (dayOfWeek ==7)
	 			{
	 				//System.out.println(j + "/" +month +"/" + year);
	 				dayOfWeek=1;
	 			}
	 			else 
	 			{
	 				//System.out.println(j + "/" +month +"/" + year);
	 				dayOfWeek++;
	 			}
	 			
	 		}
	 		month++;
		}
		year++;
		 return sundays;
}
			
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    if ((year %4 ==0)&& (year %100 != 0 || year %400 ==0))
	    {
	    	return true;
	    }
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) { //function returns the number of days in a month
		if (month ==2){ //checks the month of february
			if(isLeapYear(year)){
				return 29; //if it's a leap year then return 29
			}
			else {
				return 28; //if not a leap year then return 28;
			}
		}
		if (month %2 ==0 && month >7)
		{
			return 31;
		}
		if (month % 2 == 0 && month < 7)
		{
			return 30;
		}
		if (month %2 ==1 && month <=7)
		{
			return 31;
		}
		else {
			return 30;
		}
	}
}
