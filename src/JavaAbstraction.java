import model.AbstractVehicle;
import model.Truck;

public class JavaAbstraction {

    public static void main(String[] args) {
        // abstract = 	abstract classes cannot be instantiated, but they can have a subclass
        // 				abstract methods are declared without an implementation

//        AbstractVehicle vehicle = new AbstractVehicle;
        Truck truck = new Truck();
        truck.go();
    }
}