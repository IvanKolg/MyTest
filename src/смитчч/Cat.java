package смитчч;

import Массивы2.SortArray;

public class Cat extends Predok implements Animal {
   @Override
   public boolean eat(String food) {
        for (int i = 0; i < 7; i++) {
            System.out.println("кусь " + i);
        }
       System.out.println("Набил пузо");
        return true;
   }

   @Override
    public void run(int speed) {
       switch (speed) {
           case 5:
               System.out.println("Идет кушать");
               break;
           case 10:
               System.out.println("Бежит гулять");
               break;
           case 20:
               System.out.println("Догоняет мышь");
               break;
           default:
               System.out.println("Гуляет");
               break;
       }
   }

    @Override
    public void say() {
        System.out.println("Привяу");
    }
}
