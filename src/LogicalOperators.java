import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Example 1
//        int temp = 35;
//
//        if (temp > 30) {
//            System.out.println("It is hot outside");
//        } else if (temp >= 20 && temp <= 30) {
//            System.out.println("It is warm outside");
//        } else {
//            System.out.println("It is cold outside");
//        }
//        Example 2
//        System.out.println("You are playing a game! Press q or Q to quit");
//        String response = scanner.next(); //Next will store the next key we press
//
//        if (response.equals("q") || response.equals("Q")) {
//            System.out.println("You quit the game");
//        } else {
//            System.out.println("You are still playing the game");
//        }
//        Example 3
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next(); //Next will store the next key we press

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game");
        } else {
            System.out.println("You quit the game");
        }

    }
}