/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for (int i =1; i<13; i++)
		{

			System.out.println("Month " + i + " has " + nDaysInMonth(i,year) +" days");
		} 
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
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
	public static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
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

