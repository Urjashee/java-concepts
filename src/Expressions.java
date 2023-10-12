public class Expressions {

    public static void main(String[] args) {
        int friends = 10;
        int friends1 = friends + 1;
        int friends2 = friends - 1;
        int friends3 = friends * 2;
        int friends4 = friends / 5;
        int friends5 = friends % 3;
        double friends6 = (double) friends / 3;

//        friends++;
//        friends--;

        System.out.println("Add : " + friends1);
        System.out.println("Sub : " + friends2);
        System.out.println("Mul : " + friends3);
        System.out.println("Div : " + friends4);
        System.out.println("Mod : " + friends5);
        System.out.println("Casting : " + friends6);
//        System.out.println("Increment : " + friends);
//        System.out.println("Decrement : " + friends);
    }
}