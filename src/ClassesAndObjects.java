import Ujas.Soldat;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-56);
        System.out.println("Выводим значение: "+person1.getName());
        System.out.println("Выводим значение: "+person1.getAge());
        person1.personCreate();

    }
}
class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            name = userName;
        }
    }
    public String getName() {
        return name;
    }
    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            this.age = userAge;
        }
    }
    public int getAge() {
        return age;
    }
    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calcilateYearsToRetirement() {
        return 65 - age;
    }
    void personCreate() {
        for (int i=0; i < 3; i++) {
            System.out.println("My name is "+name +","+ " I'm "+age+" years old");
        }
    }
    void sayHello() {
        System.out.println("Hello!");
    }
}
