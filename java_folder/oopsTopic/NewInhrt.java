package oopsTopic;

class Fruits{
    String name;
    String categories;
    int price;


    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Categories: " + categories);
        System.out.println("Price: " + price);
    }
}

class Apple extends Fruits {
    Apple() {
        name = "Apple";
        categories = "Fruits";
        price = 50;
    }
}

public class NewInhrt {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.displayDetails();
    }

}
