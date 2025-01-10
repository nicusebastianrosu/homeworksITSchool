package explWildcard.expl03;

import java.util.ArrayList;
import java.util.List;

public class ItemHandler {
    public static void addItems(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void printItems(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();

        addItems(numberList);

        printItems(numberList);
    }
}
