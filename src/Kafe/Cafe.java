package Kafe;

public class Cafe {
    Person person;
    public void open() {

    }
    public void makeCoffee() {
        try {
            person.drinkCoffee();
        } catch (RuntimeException ex) {
            System.out.println("Hi");
        } finally {
            System.out.println("Helloooooooo");
        }

    }
    public void welcome(Person person) {
        this.person = person;
    }
    public void leave() {

    }


    class Kitchen {

    }
}
