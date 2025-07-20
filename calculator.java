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
                    case 1 -> performAddition(scanner);
                    case 2 -> performSubtraction(scanner);
                    case 3 -> performMultiplication(scanner);
                    case 4 -> performDivision(scanner);
                    case 5 -> performSquareRoot(scanner);
                    case 6 -> performPower(scanner);
                    case 7 -> performSine(scanner);
                    case 8 -> performCosine(scanner);
                    case 9 -> performTangent(scanner);
                    case 10 -> performNaturalLog(scanner);
                    case 11 -> performLogBase10(scanner);
                    case 12 -> performAbsolute(scanner);
                    case 13 -> performRound(scanner);
                    case 14 -> performCeiling(scanner);
                    case 15 -> performFloor(scanner);
                    case 16 -> performMin(scanner);
                    case 17 -> performMax(scanner);
                    case 18 -> running = false;
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // clear invalid input
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("=== Scientific Calculator ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        System.out.println("10. Natural Logarithm");
        System.out.println("11. Logarithm Base 10");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round");
        System.out.println("14. Ceil");
        System.out.println("15. Floor");
        System.out.println("16. Minimum of Two Numbers");
        System.out.println("17. Maximum of Two Numbers");
        System.out.println("18. Exit");
        System.out.print("Choose an operation: ");
    }

    // Basic Arithmetic
    public static double add(double num1, double num2) { return num1 + num2; }
    public static double subtract(double num1, double num2) { return num1 - num2; }
    public static double multiply(double num1, double num2) { return num1 * num2; }
    public static double divide(double num1, double num2) { return num2 != 0 ? num1 / num2 : Double.NaN; }

    // Scientific Functions
    public static double calculateSquareRoot(double num) { return num >= 0 ? Math.sqrt(num) : Double.NaN; }
    public static double calculatePower(double base, double exponent) { return Math.pow(base, exponent); }
    public static double calculateSine(double degrees) { return Math.sin(Math.toRadians(degrees)); }
    public static double calculateCosine(double degrees) { return Math.cos(Math.toRadians(degrees)); }
    public static double calculateTangent(double degrees) { return Math.tan(Math.toRadians(degrees)); }
    public static double calculateNaturalLogarithm(double num) { return num > 0 ? Math.log(num) : Double.NaN; }
    public static double calculateLogarithmBase10(double num) { return num > 0 ? Math.log10(num) : Double.NaN; }
    public static double absolute(double num) { return Math.abs(num); }
    public static long roundNumber(double num) { return Math.round(num); }
    public static double ceilingNumber(double num) { return Math.ceil(num); }
    public static double floorNumber(double num) { return Math.floor(num); }
    public static double findMin(double num1, double num2) { return Math.min(num1, num2); }
    public static double findMax(double num1, double num2) { return Math.max(num1, num2); }

    // Helper Methods (User Input)
    private static void performAddition(Scanner scanner) {
        double[] nums = getTwoNumbers(scanner);
        System.out.println("Result: " + add(nums[0], nums[1]));
    }

    private static void performSubtraction(Scanner scanner) {
        double[] nums = getTwoNumbers(scanner);
        System.out.println("Result: " + subtract(nums[0], nums[1]));
    }

    private static void performMultiplication(Scanner scanner) {
        double[] nums = getTwoNumbers(scanner);
        System.out.println("Result: " + multiply(nums[0], nums[1]));
    }

    private static void performDivision(Scanner scanner) {
        double[] nums = getTwoNumbers(scanner);
        if (nums[1] == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            System.out.println("Result: " + divide(nums[0], nums[1]));
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        double num = getOneNumber(scanner);
        if (num < 0) {
            System.out.println("Error: Cannot calculate square root of negative numbers.");
        } else {
            System.out.println("Result: " + calculateSquareRoot(num));
        }
    }

    private static void performPower(Scanner scanner) {
        double[] nums = getTwoNumbers(scanner);
        System.out.println("Result: " + calculatePower(nums[0], nums[1]));
    }

    private static void performSine(Scanner scanner) {
        double num = getOneNumber(scanner);
        System.out.println("Result (sin): " + calculateSine(num));
    }

    private static void performCosine(Scanner scanner) {
        double num = getOneNumber(scanner);
        System.out.println("Result (cos): " + calculateCosine(num));
    }

    private static void performTangent(Scanner scanner) {
        double num = getOneNumber(scanner);
        System.out.println("Result (tan): " + calculateTangent(num));
    }

    private static void performNaturalLog(Scanner scanner) {
        double num = getOneNumber(scanner);
        if (num <= 0) {
            System.out.println("Error: Logarithm undefined for non-positive numbers.");
        } else {
            System.out.println("Result (ln): " + calculateNaturalLogarithm(num));
        }
    }

    private static void performLogBase10(Scanner scanner) {
        double num = getOneNumber(scanner);
        if (num <= 0) {
            System.out.println("Error: Logarithm undefined for non-positive numbers.");
        } else {
            System.out.println("Result (log10): " + calculateLogarithmBase10(num));
        }
    }

    private static void performAbsolute(Scanner scanner) {
        double num = getOneNumber(scanner);
        System.out.println("Absolute Value: " + absolute(num));
    }

    private static void performRound(Scanner scanner) {
        double num = getOneNumber(scanner);
        System.out.println("Rounded: " + roundNumber(num));
    }

    private static void performCeiling(Scanner scanner) {
        double num = getOneNumber(scanner);
        System.out.println("Ceiling: " + ceilingNumber(num));
    }

    private static void performFloor(Scanner scanner) {
        double num = getOneNumber(scanner);
        System.out.println("Floor: " + floorNumber(num));
    }

    private static void performMin(Scanner scanner) {
        double[] nums = getTwoNumbers(scanner);
        System.out.println("Min: " + findMin(nums[0], nums[1]));
    }

    private static void performMax(Scanner scanner) {
        double[] nums = getTwoNumbers(scanner);
        System.out.println("Max: " + findMax(nums[0], nums[1]));
    }

    private static double[] getTwoNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return new double[]{num1, num2};
    }

    private static double getOneNumber(Scanner scanner) {
        System.out.print("Enter number: ");
        return scanner.nextDouble();
    }

}
