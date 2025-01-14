package homework08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MostExpensiveProducts {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.99));
        products.add(new Product("Smartphone", 999.99));
        products.add(new Product("Headphones", 199.99));
        products.add(new Product("Monitor", 349.99));
        products.add(new Product("Keyboard", 99.99));
        products.add(new Product("Mouse", 49.99));

        // Find the three most expensive products
        List<Product> topThreeProducts = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .limit(3)
                .collect(Collectors.toList());

        // Output the result
        System.out.println("The three most expensive products are:");
        topThreeProducts.forEach(System.out::println);
    }
}