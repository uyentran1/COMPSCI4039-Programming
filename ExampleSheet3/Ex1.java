package ExampleSheet3;

public class Ex1 {
    public static void main(String[] args) {
        
        System.out.println(sum1(4));
        System.out.println(sum2(4));
        System.out.println(sum3(4));
    }

    public static int factorial(int num) {
        int product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        return product;
    }

    // for loop
    public static int sum1(int n) {
        int sum = 0;
        int count = 0;

        for (int i = 1;; i++) {
            if (i % 3 == 0) {
                // System.out.println(i);
                count++;
                sum += i;
            }

            if (count == n) {
                break;
            }
        }

        return sum;
    }

    // while loop 
    public static int sum2(int n) {
        int sum = 0;
        int count = 0;
        int i = 0;

        while (count <= n) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }

            i++;
        }
                
            
        return sum;
    }

    // do while loop
    public static int sum3(int n) {
        int sum = 0;
        int count = 0;
        int i = 0;

        do {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }

            i++;
        }
        while (count <= n);

        return sum;
    }

}