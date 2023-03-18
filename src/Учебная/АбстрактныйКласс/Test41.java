package Учебная.АбстрактныйКласс;

public class Test41 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.makeSound();
        cat.makeSound();
        dog.eat();
        cat.eat();
    }
}
