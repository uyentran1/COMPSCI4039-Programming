package Lab4Ex1;

public class Lab4Ex2 {
    public static void main(String[] args) {

        printPrimeNumbers(5);
    }

    // Print all prime numbers between 2 and number
    public static void printPrimeNumbers(int num) {
        if (num < 2) {
            return;
        }
        else if (num == 2) {
            System.out.println(num);
        }
        else {
            System.out.println(2);
            for (int i = 3; i <= num ; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    // Return a boolean value if number is prime
    public static boolean isPrime(int num) {
        for (int i = 2; i < (Math.sqrt(num) + 1) ; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}