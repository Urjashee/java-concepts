import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        String symbol = "";

        System.out.println("Enter no of rows : ");
        rows = scanner.nextInt();
        System.out.println("Enter no of cols : ");
        cols = scanner.nextInt();
        System.out.println("Enter symbol to use : ");
        symbol = scanner.next();

        for (int i=1; i<=rows;i++) {
            System.out.println();
            for (int j=1; j<=cols; j++) {
                System.out.print(symbol);
            }
        }



    }
}