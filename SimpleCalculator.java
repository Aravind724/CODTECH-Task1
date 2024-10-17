
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to choose an operation
        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result = 0;

        // Perform the chosen operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;  // Exit the program if division by zero occurs
                }
                break;
            default:
                System.out.println("Error: Invalid operation selected.");
                return;  // Exit the program if an invalid operation is selected
        }

        // Display the result
        System.out.println("The result is: " + result);

        // Close the scanner
        scanner.close();
    }
}

