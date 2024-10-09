package Lab6Ex1;

public class StringExample {
    public static void main(String[] args)
    {
        String a = "Hello";
        String b = "Hel";
        b += "lo";
        String c = "Hello";
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.length());
    }
}
