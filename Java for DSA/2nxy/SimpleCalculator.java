
import java.io.IOException;

public class SimpleCalculator {
    public static void main(String[] args) throws IOException {
    // Check if the number of arguments is correct
    if (args.length != 2) {
    System.out.println("Please provide exactly two numbers as command-line arguments.");
    return;
    }
    try {
    // Parse the command-line arguments to double
    double num1 = Double.parseDouble(args[0]);
    double num2 = Double.parseDouble(args[1]);
    // Perform calculations
    double sum = num1 + num2;
    double difference = num1 - num2;
    double product = num1 * num2;
    double quotient = 0;
    // Check for division by zero
    if (num2 != 0) {
    quotient = num1 / num2;
    } else {
    System.out.println("Cannot divide by zero.");
    }
    // Display the results
    System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
    System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
    System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
    if (num2 != 0) {
    System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
    }
    } catch (NumberFormatException e) {
    System.out.println("Please enter valid numbers.");
    }
    }
    } 

