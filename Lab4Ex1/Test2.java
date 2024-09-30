package Lab4Ex1;

public class Test2 {
    public static void main(String[] args) {
        // Learn about break
        for (int i = 0;;i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        
        System.out.println();

        // Learn about continue
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.err.println(i);
        }
    }
}