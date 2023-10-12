import model.Bicycle;
import model.Car1;
import model.Truck;

public class JavaEncapsulation {

    public static void main(String[] args) {
        // Encapsulation = 	attributes of a class will be hidden or private,
        // 					Can be accessed only through methods (getters & setters)
        // 					You should make attributes private if you don't have a reason to make them public/protected

        Car1 car1 = new Car1("Chevrolet", "Camaro", 2021);

        car1.setYear(2022);

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
    }
}

