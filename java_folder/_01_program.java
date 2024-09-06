class Car {
    String name;
    String model;
    int year;
    String color;

    String displayDetails(){
        return "Name: " + name + "\nModel: " + model + "\nYear: " + year + "\nColor: " + color;
    }
}

public class _01_program {
    public static void main(String[] args) {
        Car Car1 = new Car();
        Car1.name = "Toyota";
        Car1.model = "Carmy";
        Car1.year = 2020;
        Car1.color = "red";

        String carDetails = Car1.displayDetails();
        System.out.println(carDetails);
    }
}