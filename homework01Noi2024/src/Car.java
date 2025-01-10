public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isElectric;

    private Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 2000;
        this.price = 0.0;
        this.isElectric = false;
    }

    public Car(String brand, String model, int year, double price, boolean isElectric) {
        this();
        setBrand(brand);
        setModel(model);
        setYear(year);
        setPrice(price);
        setElectric(isElectric);
    }

    public Car(String brand, String model, int year) {
        this();
        setBrand(brand);
        setModel(model);
        setYear(year);
    }

    public Car(String brand, double price) {
        this();
        setBrand(brand);
        setPrice(price);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.trim().isEmpty()) {
            this.brand = brand;
        } else {
            System.out.println("Brand cannot be empty.");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.trim().isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Model cannot be empty.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1885) {
            this.year = year;
        } else {
            System.out.println("Year must be after 1885.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
