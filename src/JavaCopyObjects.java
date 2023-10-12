import model.Car1;

public class JavaCopyObjects {

    public static void main(String[] args) {

        Car1 car1 = new Car1("Chevrolet", "Camaro", 2021);
//        Car1 car2 = new Car1("Ford", "Mustang", 2022);
//
//        car2.copy(car1);
        Car1 car2 = new Car1(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println("---------------------------");
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println("---------------------------");
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}

