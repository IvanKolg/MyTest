package Учебная;

import Учебная.interfaces.Animal;
import смитчч.Cat;
import смитчч.Dog;

public class Test29 {
    public static void main(String[] args) {
        Animal29 animal29 =new Animal29();
        Dog29 dog29 = new Dog29();
        Cat29 cat29 = new Cat29();

        test(animal29);
        test(dog29);
        test(cat29);
    }

    public static void test(Animal29 animal29) {
        animal29.eat();
    }
}
