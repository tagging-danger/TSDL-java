public class Product {
    private String name;
    private double price;
    private String description;

    // Default constructor
    public Product() {
        this.name = "Default Product";
        this.price = 0.0;
        this.description = "This is a default product description.";
    }

    // Parameterized constructor
    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
    }

    public static void main(String[] args) {
        // Testing default constructor
        System.out.println("Testing Default Constructor:");
        Product defaultProduct = new Product();
        defaultProduct.displayDetails();
        System.out.println();

        // Testing parameterized constructor
        System.out.println("Testing Parameterized Constructor:");
        Product customProduct = new Product("Custom Product", 25.99, "This is a custom product description.");
        customProduct.displayDetails();
    }
}
