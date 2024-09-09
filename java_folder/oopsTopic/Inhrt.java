// Parent class (Superclass)
class Vehicle {
    String brand;
    int speed;

    // Constructor to initialize common vehicle properties
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method that all vehicles have
    void start() {
        System.out.println("The vehicle is starting...");
    }

    // Method to display common vehicle details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Child class (Subclass) that inherits from Vehicle
class Car extends Vehicle {
    int numberOfDoors;

    // Constructor for Car class, using 'super()' to call the Vehicle constructor
    Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);  // Calls the Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Car-specific method
    void honk() {
        System.out.println("The car is honking: Beep Beep!");
    }

    // Override the displayDetails method to add car-specific details
    @Override
    void displayDetails() {
        super.displayDetails();  // Call the parent class method
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

public class Inhrt {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota", 180, 4);

        // Calling methods
        myCar.start();  // Inherited from Vehicle
        myCar.honk();   // Specific to Car
        myCar.displayDetails();  // Overridden method to show additional details
    }
}
