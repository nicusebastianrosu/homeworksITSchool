package homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctBooksByTitle {
    public static void main(String[] args) {
        // Create a list of books with duplicates
        List<Book> books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Animal Farm", "George Orwell"));
        books.add(new Book("1984", "George Orwell")); // Duplicate title
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("1984", "Another Author")); // Duplicate title, different author

        // Filter out duplicate books by title using distinct()
        List<Book> distinctBooks = books.stream()
                .distinct()
                .collect(Collectors.toList());

        // Output the result
        System.out.println("Distinct books by title:");
        distinctBooks.forEach(System.out::println);
    }
}