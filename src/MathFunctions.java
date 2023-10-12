import java.util.Scanner;

public class MathFunctions {

    public static void main(String[] args) {
//        double x = 3.14;
//        double y = -10;
//
//        double z = Math.max(x,y);
//        double z1 = Math.min(x,y);
//        double z2 = Math.abs(y);
//        double z3 = Math.sqrt(x);
//        double z4 = Math.round(x);
//        double z5 = Math.ceil(x); //Round-up
//        double z6 = Math.floor(x); //Round-down
//
//        System.out.println(z);
//        System.out.println(z1);
//        System.out.println(z2);
//        System.out.println(z3);
//        System.out.println(z4);
//        System.out.println(z5);
//        System.out.println(z6);
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("The hypotenuse is : " + z);

        scanner.close();
    }
}