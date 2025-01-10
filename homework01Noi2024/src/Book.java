public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;
    private boolean isHardcover;

    private Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.pages = 0;
        this.price = 0.0;
        this.isHardcover = false;
    }


    public Book(String title, String author, int pages, double price, boolean isHardcover) {
        this();
        setTitle(title);
        setAuthor(author);
        setPages(pages);
        setPrice(price);
        setHardcover(isHardcover);
    }


    public Book(String title, String author) {
        this();
        setTitle(title);
        setAuthor(author);
    }


    public Book(String title, String author, int pages) {
        this();
        setTitle(title);
        setAuthor(author);
        setPages(pages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be empty.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Author cannot be empty.");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            throw new IllegalArgumentException("Number of pages must be positive.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
    }

    public boolean isHardcover() {
        return isHardcover;
    }

    public void setHardcover(boolean hardcover) {
        isHardcover = hardcover;
    }
}
