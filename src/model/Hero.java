package model;
//Child Class/ Sub Class
public class Hero extends Person{
    public String power;

    public Hero(String name, int age, String power) {
        super(name,age);
        this.power = power;
    }

    public String toString() {
        return super.toString()+this.power;
    }
}
