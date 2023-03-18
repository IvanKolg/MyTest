package смитчч;

public class Dog extends Predok implements Animal {
    @Override
    public boolean eat (String food) {
        if (food.equals("Мясо")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run (int speed) {
        System.out.println("Собака бежит со скоростью " + speed);
    }

    @Override
    public void say() {
        System.out.println("Хеллоу!");
    }
}

