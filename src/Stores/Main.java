package Stores;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Samsung samsung = new Samsung(stock);
        samsung.setInSellAndPrice(new String[]{"monitor", "compucter", "keyboard"}, new int[] {20000, 50000, 5000});
        samsung.sell(new String[] {"monitor", "compucter", "keyboard", "monitor", "compucter", "keyboard","monitor","monitor","monitor"});

    }


}
