public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Nicu", 34, true, "1940515344967", false);
        Person p2 = new Person();
        p2.setName("John");
        System.out.println(p1.getName() + " are dacia Sandero");
        System.out.println(p2.getName());
        Person p3 = new Person("Doe", 35);
        System.out.println(p3.getName());

        System.out.println("===================");
        Book book1 = new Book("", "Radu Tudoran", 580, 10.99, true);
        Book book2 = new Book("2024", "Mircea Cartarescu ");
        Book book3 = new Book("Solenoid", "Mircea Cartarescu", 2021);

        System.out.println("Book 1: " + book1.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(book3.getTitle());

        System.out.println("=====================");
        Car car1 = new Car("Toyota", "Corolla", 2020, 20000, false);
        Car car2 = new Car("Tesla", "Model 3", 2022);
        Car car3 = new Car("Ford", 15000);
        Car car4 = new Car("Toyota", "Corolla", 2020, -20000, false);

        // Print car details
        System.out.println("Car 1: " + car1.getBrand() + ", Model: " + car1.getModel());
        System.out.println("Car 2: " + car2.getBrand() + ", Year: " + car2.getYear());
        System.out.println("Car 3: " + car3.getBrand() + ", Price: $" + car3.getPrice());
        System.out.println("Car 4: " + car4.getBrand() + ", Price: $" + car4.getPrice() + ", Model: " + car4.getModel());

    }
}
