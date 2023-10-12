package model;
//Child Class/ Sub Class
public class Bicycle extends Vehicle{
    public int wheels = 2;
    public int pedals = 2;
    @Override
    public void go() {
        System.out.println("The bicycle is moving");
    }
}
