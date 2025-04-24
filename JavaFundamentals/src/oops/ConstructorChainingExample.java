package oops;

class Vehicle {

    private int speed;
    private String type;
    private String model;

    // Default Constructor
    public Vehicle() {
        this(100, "Car", "Honda");
        this.speed = 0;
        this.type = "Unknown";
        this.model = "Unknown";
    }

    // Parameterized Constructor
    public Vehicle(int speed, String type, String model) {
        this("Honda", "Car", 100);
        this.speed = speed;
        this.type = type;
        this.model = model;
    }

    public Vehicle(String model, String type, int speed) {
        this.speed = speed;
        this.type = type;
        this.model = model;
    }

    // Method
    public void displayDetails() {
        System.out.println("Speed: " + this.speed);
        System.out.println("Type: " + this.type);
        System.out.println("Model: " + this.model);
    }
}
public class ConstructorChainingExample {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle();
        vehicle.displayDetails();

    }
}
