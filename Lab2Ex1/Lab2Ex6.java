public class Lab2Ex6 {
    public static void main(String[] args) {        
        int year = 2024;
        String month = "Jan";
        int daysInMonth = daysInMonth(month, year);
        
        isLeap(year);

        System.out.println(month + " has " + daysInMonth + " days.");
    }
                
    // Prints the result whether a year is leap or not and returns the boolean value
    public static boolean isLeap(int year) {
        boolean isLeap = (year % 4 == 0);
        
        if (isLeap) {
            System.err.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }

        return isLeap;
    }

    // Returns number of days in the month
    public static int daysInMonth (String month, int year) {
        // Feb has 28 or 29 days depending on whether the year is leap
        if (month == "Feb") {
            if (isLeap(year)) {
                return 29;
            }
            else {
                return 28;
            }
        }
        // Months that have 30 days
        else if ((month == "Apr") || (month == "Jun") || (month == "Sep") || (month == "Nov")) {
            return 30;
        }
        // Months that have 31 days
        else {
            return 31;
        }
    }
}
