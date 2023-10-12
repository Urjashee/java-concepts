import java.util.ArrayList;

public class JavaMethods {

    public static void main(String[] args) {
        String name = "Shaw";
        int age = 21;
//        hello("Uj", name, age);

        int x = 3;
        int y = 4;

        int z = add(x,y);
        System.out.println("The sum is : " + z);
    }

    static void hello(String first, String second, int age) {
        System.out.println("Hello " + first + " " + second);
        System.out.println("My age is " + age);
    }

    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}