package Учебная.Generics;

import смитчч.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test33 {
    public static void main(String[] args) {
        List<Animal34> listofAnimal = new ArrayList<>();
        listofAnimal.add(new Animal34(1));
        listofAnimal.add(new Animal34(2));

        List<Dog34> listofDogs = new ArrayList<>();
        listofDogs.add(new Dog34());
        listofDogs.add(new Dog34());

        test34(listofAnimal);
        test34(listofDogs);
    }
    private static void test34(List<? extends Animal34> list34) {
        for (Animal34 animal34 : list34) {
            animal34.eat();
        }
    }
}
