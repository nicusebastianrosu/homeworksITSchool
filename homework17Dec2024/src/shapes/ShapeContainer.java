package shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeContainer<T extends Shape> {
    private List<T> shapes = new ArrayList<>();

    public void addShape(T shape) {
        shapes.add(shape);
    }

    public void addShapes(List<? extends T> shapeList) {
        shapes.addAll(shapeList);
    }

    public List<T> filterShapes(double minArea) {
        List<T> filteredShapes = new ArrayList<>();
        for (T shape : shapes) {
            if (shape.area() > minArea) {
                filteredShapes.add(shape);
            }
        }
        return filteredShapes;
    }

    public List<T> getShapes() {
        return shapes;
    }

    public static void main(String[] args) {
        // Example usage of the ShapeContainer class
        ShapeContainer<Shape> container = new ShapeContainer<>();

        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        container.addShape(circle);
        container.addShape(rectangle);
        List<Shape> shapes = container.getShapes();
        System.out.println(shapes);

        // Adding multiple shapes from a list
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(1.0));
        shapeList.add(new Rectangle(2.0, 3.0));

        container.addShapes(shapeList);

        List<Shape> largeShapes = container.filterShapes(10.0);
        System.out.println("Shapes with area greater than 10:");
        for (Shape shape : largeShapes) {
            System.out.println("Shape area: " + shape.area());
        }
    }
}
