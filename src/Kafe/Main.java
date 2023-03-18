package Kafe;

import EDA.Kafe;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        Person person = new Person("vas",23);
        cafe.open();
        cafe.welcome(person);
        cafe.makeCoffee();
        cafe.leave();
    }
}
