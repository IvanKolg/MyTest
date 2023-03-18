package Ujas;

public class Soldat {
    String name;
    int vision;
    public String getName() {
        return name;
    }
    public int getVision() {
        return vision;
    }
    public Soldat(String name, int vision) {
        this.name = name;
        this.vision = vision;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVision(int vision) {
        this.vision = vision;
    }
}
