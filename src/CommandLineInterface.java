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
    }

    public static void main(String[] args) {
        new CommandLineInterface();
    }
}
