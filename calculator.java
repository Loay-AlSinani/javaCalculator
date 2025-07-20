
import java.util.Scanner;
import java.util.InputMismatchException;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: performAddition(scanner); break;
                    case 2: performSubtraction(scanner); break;
                    case 0: running = false; break;
                    default: System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers.");
                scanner.next(); // consume invalid input
            }
        }
        scanner.close();
    }
    public static void displayMenu() {
        System.out.println("===== Scientific Calculator =====");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    private static void performAddition(Scanner scanner) {
        System.out.print("First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + add(num1, num2));
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.print("First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + subtract(num1, num2));
    }
}
