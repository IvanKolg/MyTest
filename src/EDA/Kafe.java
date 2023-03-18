package EDA;
public class Kafe {
    Kitchen kitchen;
    public Kafe(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
    public String[] blyuda = {"adin", "duwa", "turee"};
    public void kassa(int hz) {
        for (int i = 0; i < hz; i++) {
            String blyudo = blyuda[kitchen.getRand(0, blyuda.length)];
            int tem = kitchen.name();
            System.out.println(blyudo + " - " + tem + " Граммов. " + (tem / 10 * 24) + " Рублей.");
        }
    }
}
