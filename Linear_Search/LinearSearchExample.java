package Linear_Search;

public class LinearSearchExample {
    public LinearSearchExample() {
    }

    public static int linearSearch(String[] names, String target) {
        // Loop through the array
        for (int i = 0; i < names.length; i++) {
            // Check if the current element matches the target
            if (names[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        String[] names = {"akbar", "arzo", "raza", "alam", "khan", "bhai" };
        String target = "raza";
        int result = linearSearch(names, target);
        
        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
