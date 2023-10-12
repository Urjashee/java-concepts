public class JavaPrintF {

    public static void main(String[] args) {
//        System.out.printf("This is a %d format string",123);

        boolean myBoolean = true;
        char myChar = '@';
        int myInteger = 122;
        String myString = "Uj";
        double myDouble = 1000;

//        System.out.printf("%b",myBoolean);
//        System.out.printf("%c",myChar);
//        System.out.printf("%s",myString);
//        System.out.printf("%d",myInteger);
//        System.out.printf("%f",myDouble);

//        width
//        System.out.printf("Hello %10s",myString);

//        precision
//        System.out.printf("Hello %.2f",myDouble);

//        flags
        System.out.printf("You have this much money %20f",myDouble);
        System.out.printf("You have this much money %020f",myDouble);
        System.out.printf("You have this much money %,f",myDouble);
    }
}