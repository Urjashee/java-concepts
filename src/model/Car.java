package model;

public class Car {
    public String make = "Chevrolet";
    public String model = "Corvette";
    public int year = 2020;
    public String color = "blue";
    public double price = 50000.00;

    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }

    public Car(String model) {
        this.model = model;
    }
    public Car() {
    }

    public void drive() {
        System.out.println("You drive the car");
    }

    public void brake() {
        System.out.println("You stepped on th brakes");
    }
}
