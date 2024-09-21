class Fruit{
    String name;
    String weight;
    int price;

    public Fruit(String name, String weight,  int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void showTime(){
        System.out.println("Fruit Name: " + name);
        System.out.println("Fruit weight: " + weight);
        System.out.println("Price: " + price);
    }
}
public class _01_fruit{
    public static void main(String[] args) {
        Fruit fal = new Fruit("Apple", "2kg", 250);

        fal.showTime();
    }
}

