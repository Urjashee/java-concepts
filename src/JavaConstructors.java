import model.Human;

public class JavaConstructors {

    public static void main(String[] args) {
//        constructor = special method called when an object is instantiated ()created.
        Human human1 = new Human("Uj",33,51.5);
        Human human2 = new Human("Richa",12,45);
        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.eat();
        human1.drink();
    }
}
