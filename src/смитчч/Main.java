package смитчч;

public class Main {
    public static void main(String[] args) {
        chooseAnimal("Bird");
        Bird dog = new Bird();
        dog.eat("Мясо");
        dog.run(6);
        dog.say();
        dog.instinct();
    }

    public static void chooseAnimal(String chosenAnimal) {
        Animal animal;
        if (chosenAnimal.equals("Bird")) {
            animal = new Bird();
        } else if (chosenAnimal.equals("Dog")) {
            animal = new Dog();
        } else {
            animal = new Cat();
        }

        animal.eat("Мясо");
        animal.run(15);
        animal.say();
    }
}
