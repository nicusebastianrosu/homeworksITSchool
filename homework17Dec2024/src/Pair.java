public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {

        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());

        pair.setKey("Updated Age");
        pair.setValue(31);
        System.out.println("Updated Key: " + pair.getKey() + ", Updated Value: " + pair.getValue());
    }
}
