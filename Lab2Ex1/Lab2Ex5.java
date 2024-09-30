public class Lab2Ex5 {
    public static void main(String[] args) {
        double r = 5.6;
        summeriseCircle(r);
        
        String newText = stringFunction("gloomy");
        System.out.println(newText);
        }
        
    public static double compArea(double radius) {
        double pi = 3.14;
        double area = pi * radius * radius;
        return area;
    }

    public static double compCircumference(double radius) {
        double pi = 3.14;
        double circumference = 2 * pi * radius;
        return circumference;
    }

    public static void summeriseCircle(double radius) {
        double area = compArea(radius);
        double circumference = compCircumference(radius);
        System.out.println("Area         : " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static String stringFunction (String adjective) {
        String newText = adjective + " Tuesday";
        return newText;
    }
}
