package EDA;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Kafe kafe = new Kafe(kitchen);
        kafe.kassa(7);
    }
}
