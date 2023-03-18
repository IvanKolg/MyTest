package EDA;

import java.util.Random;

public class Kitchen {
    public int name() {
        int meat = (getRand(70,110));
        int vegetables = (getRand(70,110));
        int garnish = (getRand(70,110));
        return (meat + vegetables + garnish);
    }
    public int getRand(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}