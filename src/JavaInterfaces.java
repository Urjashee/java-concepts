import interfacePackage.Fish;
import interfacePackage.Hawk;
import interfacePackage.Rabbit;
import model.Car1;

public class JavaInterfaces {

    public static void main(String[] args) {
        // Interface = 	a template that can be applied to a class,
        // 				similar to inheritance, but specific to a class has/must do
        // 				classes can apply more than one interface, inheritance is limited to one direct super class
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

//        rabbit.flee();
//        hawk.hunt();

        fish.flee();
        fish.hunt();


    }
}

