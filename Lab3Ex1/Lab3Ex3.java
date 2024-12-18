package Lab3Ex1;

import java.util.Scanner;

public class Lab3Ex3 {
   public static void main(String[] args) {
      printNameAndAge();

      String userDateOfBirth = getDateofBirth();
            
      int userAge = computeAge(userDateOfBirth);
      
      System.out.println("Your age is: " + userAge);
   } 
      
   // Promt for user's first name, last name age and print them
   public static void printNameAndAge() {
      try (Scanner s = new Scanner(System.in)) {
         System.out.println("Enter your first name, last name and your age with a space in between, then press return.");
         String nameAndAge = s.nextLine();
         
         try (Scanner t = new Scanner(nameAndAge)) {
            String firstName = t.next();
            String lastName = t.next();
            int age = t.nextInt();
            
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Age: " + age);
         }
      }
   }
         
   // Promt for user's date of birth and return date of birth as a string
   public static String getDateofBirth() {
      try (Scanner s = new Scanner(System.in)) {
         System.out.println("Enter your date of birth in the format: DD MM YYYY.");
         String dateOfBirth = s.nextLine();
         System.out.println("Date of birth: " + dateOfBirth);
         return dateOfBirth;
      }
   }
         
   // Compute user's age based on date of birth
   public static int computeAge(String dateOfBirth) {
      try (Scanner u = new Scanner(dateOfBirth)) {
         int birthDay = u.nextInt();
         int birthMonth = u.nextInt();
         int birthYear = u.nextInt();
         
         int userAge;
          try ( // Promt for today's date
                  Scanner v = new Scanner(System.in)) {
              System.out.println("Enter your today's date in the format: DD MM YYYY.");
              int thisDay = v.nextInt();
              int thisMonth = v.nextInt();
              int thisYear = v.nextInt();
              // Compute user's age
              userAge = thisYear - birthYear;
              if (thisMonth < birthMonth) {
                  userAge--;
              }
              else if (thisMonth == birthMonth) {
                  if (thisDay < birthDay) {
                      userAge--;
                  }
              }    u.close();
          }

         return userAge;
      }
   }
}

