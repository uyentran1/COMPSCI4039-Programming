package Lab6Ex1;

public class ObjMethod {
    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        c.describe();
        doubleArea(c);
        c.describe();
    }

    // A method to double the area of a circle
    // To double the area, multiply the radius by sqrt(2)
    public static void doubleArea(Circle d) {
        double radius = d.getRadius();
        radius *= Math.sqrt(2);
        d.setRadius(radius);
    }
}
