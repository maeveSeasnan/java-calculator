import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation: +, -, *, /");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;  // exit the method if division by zero occurs
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;  // exit the method if invalid operator
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
