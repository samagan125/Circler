public class Circle {
    private static final double PI = 3.14;
    private static double radius;

    static double area() {
        return PI * (radius * radius);
    }

    static double circumference() {
        return PI * 2 * radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }
}


