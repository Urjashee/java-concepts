package model;
//Child Class/ Sub Class
public class Boat extends Vehicle{
    public int wheels = 4;
    public int doors = 4;

    @Override
    public void go() {
        System.out.println("The truck is moving");
    }
}
