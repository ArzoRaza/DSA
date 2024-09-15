import java.util.Scanner;

public class febonacci{

    // Method to generate and print the Fibonacci series
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + ", " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;  // Calculate the next number in the series
            System.out.print(", " + next);
            first = second;  // Move the second number to the first
            second = next;   // Update the second number to the next number
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of terms to generate in the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Ensure that the input number is positive and greater than 1
        if (n < 2) {
            System.out.println("Please enter a number greater than or equal to 2.");
        } else {
            generateFibonacci(n);
        }

        scanner.close();
    }
}
