package Week5;

public class ErrorHandlingPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        String c = null;

        try {
        System.out.println(a / 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println(c.toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
}
