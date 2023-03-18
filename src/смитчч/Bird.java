package смитчч;

public class Bird extends Predok  implements Animal {
    @Override
    public boolean eat(String food) {
        double count = 5;

        int i = 0;
        while (i < count) {
            System.out.println("Кнок-Кнок");
            i++;
        }
        return true;
    }

    @Override
    public void run(int speed) {
        boolean isRun;
        if(speed > 15) {
            isRun = true;
        } else {
            isRun = false;
        }

        if (!isRun) {
            System.out.println("Не бежит((");
        } else {
            System.out.println("Бежит");
        }
    }

    @Override
    public void say() {
        System.out.println("Кулити");
    }
}
