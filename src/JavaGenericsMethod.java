import model.MyGenericClass;

public class JavaGenericsMethod {

    public static void main(String[] args) {
        //bounded types = 	you can create the objects of a generic class to have data
        //					of specific derived types ex.Number
        //					can be achieved by extending in MyGenericClass

        MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,9);
        MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,1.01);
        MyGenericClass<Character,Character> myChar = new MyGenericClass<>('@','$');
        MyGenericClass<String,Character> myString = new MyGenericClass<>("Hello",'!');

        System.out.println(myString.getX());

    }
}