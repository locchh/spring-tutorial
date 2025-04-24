package oops;

class Product {

    // Data members
    int productId;
    String productName;
    double productPrice;

    // Default constructor
    public Product() {
        this.productId = 0;
        this.productName = "Unknown";
        this.productPrice = 0.0;
    }

    // Parameterized constructor
    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // Overloading Constructor
    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = 0.0;
    }

    public Product(String productName, double productPrice) {
        this.productId = 0;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void displayDetails() {
        System.out.println("Product Id: " + this.productId);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product Price: " + this.productPrice);
    }

    // Method Overloading
    public void displayDetails(int productId) {
        System.out.println("Product Id: " + productId);
    }
}
public class ConstructorOverloadingExample {
    public static void main(String[] args) {

        // Default constructor
        Product product1 = new Product();
        product1.displayDetails();
        System.out.println();

        // Parameterized constructor
        Product product2 = new Product(101, "Laptop", 50000.0);
        product2.displayDetails();
        System.out.println();

        // Overloading constructor
        Product product3 = new Product(102, "Mobile");
        product3.displayDetails();
        System.out.println();

        Product product4 = new Product("Tablet", 20000.0);
        product4.displayDetails();
        System.out.println();

        // Method Overloading
        Product product5 = new Product();
        product5.displayDetails(103);


    }
}
