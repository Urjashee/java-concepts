import model.*;
import package1.A;

import java.util.Scanner;

public class JavaDynamicPolymorphism {

    public static void main(String[] args) {
        // polymorphism = 	greek word for poly-"many", morph-"form"
        // 					The ability of an object to identify as more than one type
        //   dynamic = after compilation (during runtime)
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("(1=dog) or (2=cat): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("Choice was invalid");
            animal.speak();
        }
    }
}

