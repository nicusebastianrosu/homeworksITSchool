package ocp;

public class Main {
    public static void main(String[] args) {
        Square  square= new Square();
        square.setLength(2);
        System.out.println(AreaCalculator.calculateShapeArea(square));
    }
}
