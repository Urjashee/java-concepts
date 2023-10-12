import java.util.Scanner;

public class JavaArrays {

    public static void main(String[] args) {
//        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        System.out.println(cars[1]);

        for (int i=0; i<cars.length;i++) {
            System.out.println(cars[i]);
        }
    }
}