import interfacePackage.Fish;
import interfacePackage.Hawk;
import interfacePackage.Rabbit;
import model.Bicycle;
import model.Boat;
import model.Truck;
import model.Vehicle;
import package1.B;

public class JavaPolymorphism {

    public static void main(String[] args) {
        // polymorphism = 	greek word for poly-"many", morph-"form"
        // 					The ability of an object to identify as more than one type

        Truck truck = new Truck();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {truck,bicycle,boat};

//        truck.go();
//        truck.go();
//        truck.go();
        for (Vehicle x: racers) {
            x.go();
        }
    }
}

