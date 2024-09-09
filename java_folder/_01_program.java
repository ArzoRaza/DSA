/*
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
 */


//  here are peoporming Without Constructor program 

class Car{
    String name;
    String model;
    int year;
    String color;

    String displayResults(){
        return "Name: " + name + "\nModel: " + model + "\nYear: " + year + "\nColor: " + color;
        
        // it's apply when void are replace String.
        // System.out.println("NameA: " + Name);
        // System.out.println("Model: " + Model);
        // System.out.println("YearZ: " + Year);
        // System.out.println("Color: " + Color);
    }
}

public class _01_program {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;
        car1.color = "Red";

        Car car2 = new Car();
        car2.name = "Honda";
        car2.model = "Civic";
        car2.year = 2018;
        car2.color = "Blue";

        Car car3 = new Car();
        car3.name = "Ford";
        car3.model = "Mustang";
        car3.year = 2021;
        car3.color = "Black";

        Car car4 = new Car();
        car4.name = "BMW";
        car4.model = "X5";
        car4.year = 2019;
        car4.color = "White";

        Car car5 = new Car();
        car5.name = "Audi";
        car5.model = "A6";
        car5.year = 2020;
        car5.color = "Silver";

        Car car6 = new Car();
        car6.name = "Tesla";
        car6.model = "Model 3";
        car6.year = 2021;
        car6.color = "Gray";

        Car car7 = new Car();
        car7.name = "Mercedes";
        car7.model = "C-Class";
        car7.year = 2017;
        car7.color = "Black";

        Car car8 = new Car();
        car8.name = "Chevrolet";
        car8.model = "Malibu";
        car8.year = 2018;
        car8.color = "Blue";

        Car car9 = new Car();
        car9.name = "Volkswagen";
        car9.model = "Jetta";
        car9.year = 2019;
        car9.color = "Red";

        Car car10 = new Car();
        car10.name = "Nissan";
        car10.model = "Altima";
        car10.year = 2021;
        car10.color = "White";


        System.out.println(car1.displayResults());
        System.out.println(car2.displayResults());
        System.out.println(car3.displayResults());
        System.out.println(car4.displayResults());
        System.out.println(car5.displayResults());
        System.out.println(car6.displayResults());
        System.out.println(car7.displayResults());
        System.out.println(car8.displayResults());
        System.out.println(car9.displayResults());
        System.out.println(car10.displayResults());

    }
}