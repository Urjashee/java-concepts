import model.Car;

public class JavaToStringMethod {

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.toString()); //Calling explicitly
        System.out.println(car); //calling implicitly
    }
}
