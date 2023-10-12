public class Variables {

    public static void main(String[] args) {
        int x = 123;
        double y = 3.14;
        boolean z = true;
        char symbol = '@';
        String name = "Bro";

        String a = "water";
        String b = "kool-aid";
        String temp;

        temp = a;
        a=b;
        b=temp;

        System.out.println("Hello "+symbol);
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}