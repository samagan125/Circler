public class Circle {
    private static final double PI = 3.14;
    private double radius;

    static double area(double radius) {
        return PI * (radius * radius);
    }

    static double circumference(double radius) {
        return PI * 2 * radius;

    }
}


