class Vehicle {
    String Models;
    int Speed;
    String Color;

    void DesplayDetails() {
        System.out.println("Model: " + Models);
        System.out.println("Speed: " + Speed);
        System.out.println("Color: " + Color);
    }
}
public class ClassObj {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.Models = "Claccic";
        car1.Color = "black";
        car1.Speed = 220;

        car1.DesplayDetails();
    }
}