package Учебная.lesson32;

public class Test32 {
    public static void main(String[] args) {

        Dog32 dog32 = new Dog32();
//        Upcasting - Восходящее преобразование
        Animal32 animal32 = new Dog32();

//        Downcasting - Нисходящее преобразование
        Dog32 dog322 = (Dog32) animal32;
        dog322.bark();

    }
}
