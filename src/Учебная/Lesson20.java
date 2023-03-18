package Учебная;

public class Lesson20 {
    public static void main(String[] args) {
        Human20.description = "Nick";
        Human20.getDescription();
        Human20 humen20 = new Human20("Bob",48);

    }

}
class Human20 {
    private String name;
    private int age;
    public static String description;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Human20(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void getDescription() {
        System.out.println(description);
    }
}