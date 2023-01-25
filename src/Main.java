import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("Result: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("You cant divide by zero!");
        }
        catch (InputMismatchException e) {
            System.out.println("Type only numbers!");
        }
    }
}