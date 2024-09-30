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
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your first name, last name and your age with a space in between, then press return.");
      String nameAndAge = s.nextLine();
      // s.close();
      
      Scanner t = new Scanner(nameAndAge);
      String firstName = t.next();
      String lastName = t.next();
      int age = t.nextInt();
      // t.close();
      
      System.out.println("First name: " + firstName);
      System.out.println("Last name: " + lastName);
      System.out.println("Age: " + age);
   }
         
   // Promt for user's date of birth and return date of birth as a string
   public static String getDateofBirth() {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your date of birth in the format: DD MM YYYY.");
      String dateOfBirth = s.nextLine();
      System.out.println("Date of birth: " + dateOfBirth);
      // s.close();
      return dateOfBirth;
   }
         
   // Compute user's age based on date of birth
   public static int computeAge(String dateOfBirth) {
      Scanner u = new Scanner(dateOfBirth);
      int birthDay = u.nextInt();
      int birthMonth = u.nextInt();
      int birthYear = u.nextInt();
      // u.close();
      
      // Promt for today's date
      Scanner v = new Scanner(System.in);
      System.out.println("Enter your today's date in the format: DD MM YYYY.");
      
      int thisDay = v.nextInt();
      int thisMonth = v.nextInt();
      int thisYear = v.nextInt();
      
      // v.close();

      // Compute user's age
      int userAge = thisYear - birthYear;
      
      if (thisMonth < birthMonth) {
         userAge--;
      }
      else if (thisMonth == birthMonth) {
         if (thisDay < birthDay) {
            userAge--;
         }
      }

      return userAge;
   }
}

