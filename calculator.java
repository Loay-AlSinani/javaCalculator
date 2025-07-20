import java.util.Scanner;

public class calculator {

    public static void displayMenu() {
        System.out.println("Simple Calculator");
        System.out.println("-----------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("You selected option " + choice + ". Functionality coming soon.");
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
