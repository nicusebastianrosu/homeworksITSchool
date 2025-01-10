public class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void clear() {
        item = null;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, World!");
        System.out.println("String in the box: " + stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.set(123);
        System.out.println("Integer in the box: " + integerBox.get());

        stringBox.clear();
        System.out.println("String in the box after clearing: " + stringBox.get());
    }
}
