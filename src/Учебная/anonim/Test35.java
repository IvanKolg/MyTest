package Учебная.anonim;


import Учебная.Generics.Animal34;

interface AbleToEat35 {
    public void eat();
}

public class Test35 {
    public static void main(String[] args) {
        AbleToEat35 ableToEat35 = new AbleToEat35() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat35.eat();
    }

}
