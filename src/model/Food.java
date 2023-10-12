package model;

public class Food {
    public String name;
    public String sauce;
    public String cheese;
    public String toppings;
    public Food(String name, String sauce, String cheese, String toppings) {
        this.name = name;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }
    public Food(String name, String sauce, String cheese) {
        this.name = name;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    public Food(String name, String sauce) {
        this.name = name;
        this.sauce = sauce;
    }
    public Food(String name) {
        this.name = name;
    }
    public Food() {

    }

    public void eat() {
        System.out.println();
    }
    public void drink() {
        System.out.println();
    }
}
