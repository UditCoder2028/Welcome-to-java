import java.util.Scanner;  // Import Scanner class to read input

public class Addition_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object to read input
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();  // Read first integer
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();  // Read second integer
        
        int sum = num1 + num2;  // Add the two numbers
        
        System.out.println("Sum = " + sum);  // Print the result
        
        scanner.close();  // Close the scanner
    }
}