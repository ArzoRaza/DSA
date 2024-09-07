// First create class
class fruits{
    String name;
    String weight;
    int price;

    // Constructor
    fruits(String name, String weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    String displayDetails(){
        return "Name: " + name + "\nweight: " + weight + "\nPrice: " + price;
        
        // System.out.println("Name: " + name);
        // System.out.println("weight: " + weight);
        // System.out.println("price: " + price);
    }

}

public class _02_program {
    public static void main(String[] args) {
        fruits box1 = new fruits("Apple", "2kg", 140);
        fruits box2 = new fruits("banana", "5kg", 300);
        fruits box3 = new fruits("Guava", "3kg", 210);
        fruits box4 = new fruits("Orange", "5kg", 350);
        fruits box5 = new fruits("Mango", "5kg", 400);
        fruits box6 = new fruits("Pineapple", "5kg", 660 );
        fruits box7 = new fruits("Grapes", "4kg", 300);
        fruits box8 = new fruits("Strawberry", "5kg", 500);
        fruits box9 = new fruits("WaterMelon", "3kg", 200);
        fruits box10 = new fruits("Papaya", "4kg", 300);


        // this apply when displayDetails are void
        // box1.name = "Apple";
        // box1.weight = "2kg";
        // box1.price = 140;
        
        // box1.displayDetails();


        System.out.println(box1.displayDetails());
        System.out.println(box2.displayDetails());
        System.out.println(box3.displayDetails());
        System.out.println(box4.displayDetails());
        System.out.println(box5.displayDetails());
        System.out.println(box6.displayDetails());
        System.out.println(box7.displayDetails());
        System.out.println(box8.displayDetails());
        System.out.println(box9.displayDetails());
        System.out.println(box10.displayDetails());
    }
}