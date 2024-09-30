package Lab5Ex1;

public class Lab5Ex1 {
    public static void main(String[] args) {
        printTimesTable(8, 15);
        
    }

    public static void printTimesTable(double num, int times) {
        if ((0 <= num && num<= 100) && (times <= 99)) {
        
            for (int i = 1; i <= times; i++) {
                System.out.printf("%06.3f x %02d = %09.3f\n", num, i, num * i);
            }
            
        }
        else {
            System.out.println("Not meet conditions.");
            return;
        }
    }
}
