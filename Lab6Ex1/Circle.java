package Lab6Ex1;

public class Circle {
    public double radius;

    public Circle(double r) {
        radius = r;
    }

    public double compArea() {
        return 3.14152 * radius * radius;
    }

    public double compCir() {
        return 3.14152 * 2 * radius;
    }

    public void describe() {
        System.out.println("This circle has: ");
        System.out.println("\tradius " + radius);
        System.out.println("\tarea " + compArea());
        System.out.println("\tcircumference " + compCir());
    }
}
