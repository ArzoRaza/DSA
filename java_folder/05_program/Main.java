class Animal{
    public void eat(){
        System.out.println("The animal eat foods ");
    }
}

class Dog extends Animal{
    public void barks(){
        System.out.println("The Dog barks");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();
        dog.barks();
    }
}