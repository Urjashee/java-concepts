import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a whole no to divide: ");
            int x = scanner.nextInt();

            System.out.print("Enter a whole no to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
            scanner.close();
        }
    }
}