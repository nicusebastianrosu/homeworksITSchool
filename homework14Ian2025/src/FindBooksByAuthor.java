package homework06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindBooksByAuthor {
    public static void main(String[] args) {
        // Create a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Animal Farm", "George Orwell"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("Brave New World", "Aldous Huxley"));

        // Specify the author to search for
        String targetAuthor = "George Orwell";

        // Find all books by the specified author
        List<Book> booksByAuthor = books.stream()
                                        .filter(book -> book.getAuthor().equals(targetAuthor))
                                        .collect(Collectors.toList());

        // Output the result
        System.out.println("Books by " + targetAuthor + ": " + booksByAuthor);
    }
}