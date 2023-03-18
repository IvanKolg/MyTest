package Учебная.equals;

public class Test42 {
    public static void main(String[] args) {
//        Animal42 animal42 = new Animal42(1);
//        Animal42 animal421 = new Animal42(1);
//
//        System.out.println(animal42.equals(animal421));
        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1.equals(string2));
    }
}

class Animal42 {
    private int id;
    public Animal42(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal42 otherAnimal = (Animal42) obj;
        return this.id == otherAnimal.id;
    }
}