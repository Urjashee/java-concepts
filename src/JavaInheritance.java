import model.Bicycle;
import model.Truck;

public class JavaInheritance {

    public static void main(String[] args) {
//        inheritance = the process where one class acquires
//                      the attribute and method of another class
        Truck truck = new Truck();
//        truck.go();

        Bicycle bicycle = new Bicycle();
//        bicycle.stop();

//        System.out.println(truck.speed);
//        System.out.println(bicycle.speed);

        System.out.println(truck.doors);
        System.out.println(bicycle.pedals);
    }
}

