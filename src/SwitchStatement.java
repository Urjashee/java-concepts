import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a day number ");
        int day = scanner.nextInt();
        scanner.nextLine();

        switch (day) {
            case 0:
                System.out.println("It is Sunday!");
                break;
            case 1:
                System.out.println("It is Monday!");
                break;
            case 2:
                System.out.println("It is Tuesday!");
                break;
            case 3:
                System.out.println("It is Wednesday!");
                break;
            case 4:
                System.out.println("It is Thursday!");
                break;
            case 5:
                System.out.println("It is Friday!");
                break;
            case 6:
                System.out.println("It is Saturday!");
                break;
            default:
                System.out.println("No such day");
                break;
        }
    }
}