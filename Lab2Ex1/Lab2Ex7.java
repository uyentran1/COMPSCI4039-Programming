public class Lab2Ex7 {
    // Returns the number of whole years old from today's date and date of birth
    public static void main(String[] args) {
        int todaysDay = 10;
        int todaysMonth = 11;
        int todaysYear = 2024;

        int birthDay = 10;
        int birthMonth = 11;
        int birthYear = 1995;

        int wholeYears = todaysYear - birthYear;

        // If todaysMonth < birthMonth, deduct 1 year from wholeYears
        if (todaysMonth - birthMonth < 0) {
            wholeYears--;
        }
        // If todayMonth = birthMonth, if todaysDay < birthDay, deduct 1 year from wholeYears
        else if (todaysMonth == birthMonth) {
            if (todaysDay < birthDay) {
                wholeYears--;
            }
        }
        System.out.println(wholeYears);
    }        
}
