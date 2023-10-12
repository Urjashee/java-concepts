import model.Human;
import model.Pizza;

public class JavaOverloadedConstructors {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("thick-crust", "tomato", "cheddar", "pepperoni");
        Pizza pizza2 = new Pizza("thick-crust", "tomato", "cheddar");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
//        System.out.println(pizza1.toppings);
    }
}
