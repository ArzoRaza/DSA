class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    String DesplayDetails(){
        return "Name: " + name + "\nAge: " + age;
    }
}

public class Constructor{
    public static void main(String[] args) {
        Person person1 = new Person("Arzo", 20);

        System.out.println(person1.DesplayDetails());
    }
}