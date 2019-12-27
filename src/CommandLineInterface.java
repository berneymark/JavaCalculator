import java.util.Scanner;

public class CommandLineInterface {
    private static Calculator calc = new Calculator();
    private static Scanner scan = new Scanner(System.in);

    public CommandLineInterface() {
        System.out.println("Enter two numbers: ");

        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();

        System.out.println("Please pick one of the above functions to perform on these two numbers");
        System.out.println(
            "  1. Addition" +
            "  2. Subtraction" +
            "  3. Multiplication" +
            "  4. Division");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                calc.addition(numOne, numTwo);
                break;
            case 2:
                calc.subtraction(numOne, numTwo);
                break;
            case 3:
                calc.multiplication(numOne, numTwo);
                break;
            case 4:
                calc.division(numOne, numTwo);
                break;
            default:
                System.out.println("This number does nothing.");
                break;
        }
    }

    public static void main(String[] args) {
        new CommandLineInterface();
    }
}
