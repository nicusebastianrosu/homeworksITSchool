public class AreaCalculator {

    // Method to calculate the area of a circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        // Test inputs
        double circleRadius = 5.0;
        double rectangleLength = 10.0;
        double rectangleWidth = 4.0;
        double triangleBase = 8.0;
        double triangleHeight = 5.0;

        // Calculate areas
        double circleArea = areaOfCircle(circleRadius);
        double rectangleArea = areaOfRectangle(rectangleLength, rectangleWidth);
        double triangleArea = areaOfTriangle(triangleBase, triangleHeight);

        // Print areas
        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}
