import java.util.Locale;

public class JavaMethodChaining {

    public static void main(String[] args) {
        //        method chaining =  a common syntax for invoking multiple method calls in OOP
        //                           condense code into less lines

        String name = "    Uj";

        name = name.concat(" Shaw").toUpperCase().trim();
//        name = name.toUpperCase();
//        name = name.trim();

        System.out.println(name);
    }
}