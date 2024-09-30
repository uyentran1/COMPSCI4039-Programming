package Lab6Ex1;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(1.2);
        Circle d = new Circle(4.56);

        System.out.println(c.compArea());
        d.describe();
    }
    
}
