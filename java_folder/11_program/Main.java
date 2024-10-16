import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Akbar", "Arzo", "Edward");

        // Filter names starting with 'A' and print them
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
