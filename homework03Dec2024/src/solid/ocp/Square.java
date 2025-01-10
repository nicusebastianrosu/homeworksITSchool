package ocp;

public class Square implements Shape {

    private double length;

    @Override
    public double calculateArea() {
        return length * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
