import java.util.ArrayList;
import java.util.List;

public class Container<T extends Number> {
    private List<T> items;

    public Container() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public double sum() {
        double sum = 0.0;
        for (T item : items) {
            sum += item.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>();
        intContainer.add(1);
        intContainer.add(2);
        intContainer.add(3);
        System.out.println("Sum of integers: " + intContainer.sum());

        Container<Double> doubleContainer = new Container<>();
        doubleContainer.add(1.1);
        doubleContainer.add(2.2);
        doubleContainer.add(3.3);
        System.out.println("Sum of doubles: " + doubleContainer.sum());

        Container<Float> floatContainer = new Container<>();
        floatContainer.add(1.6f);
        floatContainer.add(1.07f);
        floatContainer.add(1.008F);
        System.out.println("Sum of floats: " + floatContainer.sum());

        // Container<String> stringContainer = new Container<String>();
    }
}
