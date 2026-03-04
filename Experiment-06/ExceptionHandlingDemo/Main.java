package ExceptionHandlingDemo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        try {
            int result = calculator.divide(a, b);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}