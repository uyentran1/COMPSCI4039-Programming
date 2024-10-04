package Lab6Ex1;

public class Ellipse {
    private double a = 7.0;
    private double b = 7.0;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
        System.out.println(a);
        System.out.println(this.a);
    }
    
    public Ellipse(double a) {
        this.a = a;
        this.b = a;
    }

    public String toString() {
        return "a: " + a + ", b: " + b;
    }

    public static void main(String[] args) {
        Ellipse x = new Ellipse(4.0, 5.0);
    }
}
