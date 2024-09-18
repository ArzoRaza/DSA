class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void DesplayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor{
    public static void main(String[] args) {
        Person person1 = new Person("Arzo", 20);
        Person person2 = new Person("Akbar", 21);
        Person person3 = new Person("Gaurav", 23);

        person1.DesplayDetails();
        person2.DesplayDetails();
        person3.DesplayDetails();
    }
}