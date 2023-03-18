package Учебная.Generics;

public class Animal34 {
    private int id;
    public Animal34() {}

    public Animal34(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }
    public String toString() {
        return String.valueOf(id);
    }
}
