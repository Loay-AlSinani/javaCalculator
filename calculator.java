import java.util.Scanner;

public class calculator {

    public static void displayMenu() {
        System.out.println("Simple Calculator");
        System.out.println("-----------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Round");
        System.out.println("6. Square Root");
        System.out.println("7. Power");
        System.out.println("8. Sine");
        System.out.println("9. Cosine");
        System.out.println("10. Tangent");
        System.out.println("11. Log (base e)");
        System.out.println("12. Log (base 10)");
        System.out.println("13. Absolute Value");
        System.out.println("14. Ceil");
        System.out.println("15. Floor");
        System.out.println("16. Min of Two Numbers");
        System.out.println("17. Max of Two Numbers");
        System.out.println("18. Exit");
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
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    double subNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double subNum2 = scanner.nextDouble();
                    System.out.println("Result: " + (subNum1 - subNum2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    double mulNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double mulNum2 = scanner.nextDouble();
                    System.out.println("Result: " + (mulNum1 * mulNum2));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    double divNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double divNum2 = scanner.nextDouble();
                    if (divNum2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (divNum1 / divNum2));
                    }
                    break;
                case 5:
                    System.out.print("Enter number to round: ");
                    double roundNum = scanner.nextDouble();
                    System.out.println("Result: " + Math.round(roundNum));
                    break;
                case 6:
                    System.out.print("Enter number: ");
                    double sqrtNum = scanner.nextDouble();
                    System.out.println("Square root: " + Math.sqrt(sqrtNum));
                    break;
                case 7:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                    break;
                case 8:
                    System.out.print("Enter angle in degrees: ");
                    double sinAngle = scanner.nextDouble();
                    System.out.println("Sine: " + Math.sin(Math.toRadians(sinAngle)));
                    break;
                case 9:
                    System.out.print("Enter angle in degrees: ");
                    double cosAngle = scanner.nextDouble();
                    System.out.println("Cosine: " + Math.cos(Math.toRadians(cosAngle)));
                    break;
                case 10:
                    System.out.print("Enter angle in degrees: ");
                    double tanAngle = scanner.nextDouble();
                    System.out.println("Tangent: " + Math.tan(Math.toRadians(tanAngle)));
                    break;
                case 11:
                    System.out.print("Enter number: ");
                    double logNum = scanner.nextDouble();
                    System.out.println("Natural log: " + Math.log(logNum));
                    break;
                case 12:
                    System.out.print("Enter number: ");
                    double log10Num = scanner.nextDouble();
                    System.out.println("Log base 10: " + Math.log10(log10Num));
                    break;
                case 13:
                    System.out.print("Enter number: ");
                    double absNum = scanner.nextDouble();
                    System.out.println("Absolute value: " + Math.abs(absNum));
                    break;
                case 14:
                    System.out.print("Enter number: ");
                    double ceilNum = scanner.nextDouble();
                    System.out.println("Ceil: " + Math.ceil(ceilNum));
                    break;
                case 15:
                    System.out.print("Enter number: ");
                    double floorNum = scanner.nextDouble();
                    System.out.println("Floor: " + Math.floor(floorNum));
                    break;
                case 16:
                    System.out.print("Enter first number: ");
                    double min1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double min2 = scanner.nextDouble();
                    System.out.println("Min: " + Math.min(min1, min2));
                    break;
                case 17:
                    System.out.print("Enter first number: ");
                    double max1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double max2 = scanner.nextDouble();
                    System.out.println("Max: " + Math.max(max1, max2));
                    break;
                case 18:
                    System.out.println("Exiting program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid number.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
