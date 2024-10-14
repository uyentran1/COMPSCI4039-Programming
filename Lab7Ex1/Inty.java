package Lab7Ex1;

public class Inty {
    public static void main(String[] args)
    {
        @SuppressWarnings("removal")
        Integer a = new Integer(3);
        Integer b = 3;
        double c = a.doubleValue();
        Integer d = Integer.parseInt("4");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
