package oopsTopic;

class Human {
    String Name;
    String Nationality;
    int age;

    // Method to display the details of the Human object
    void displayDetails() {
        System.out.println("Name: " + this.Name);
        System.out.println("Nationality: " + this.Nationality);
        System.out.println("Age: " + this.age);
    }
}

public class NewObjClass {
    public static void main(String[] args) {
        // Creating a new Human object
        Human human = new Human();

        // You can assign values to the attributes like this:
        human.Name = "John";
        human.Nationality = "American";
        human.age = 30;

        // Displaying the details of the Human object
        human.displayDetails();
    }
}
