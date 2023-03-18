package смитхх;

public class Terminator implements Robot {
    private String model;
    private int lifeTime;
    private String price;
    @Override
    public void say() {
        System.out.println("I'll be back");
    }
    @Override
    public String fight(boolean strong, int winStreak) {
        double hit = 7;
        for (int i = 0; i < hit; i++) {
            System.out.println("Удар");
        }

        return "POBEDA";
    }

    public Terminator(String model, int lifeTime, String price) {
        this.model = model;
        this.lifeTime = lifeTime;
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public int getLifeTime() {
        return lifeTime;
    }
    public String getPrice() {
        return price;
    }
    public void setModel(String model) {
        this.model = model;
    }


}

