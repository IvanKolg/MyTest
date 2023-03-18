package Stores;

import java.util.HashMap;
import java.util.Map;

public abstract class Abstr {
    private String[] inSell;
    private int[] inPrice;
    Map<String,Integer> mapItem = new HashMap<>();
    Map<String,Integer> mapPrice = new HashMap<>();
    private Stock stock;
    public String[] getInSell() {
         return inSell;
    }
    public void setInSellAndPrice(String[] inSell, int[] inPrice) {
        this.inSell = inSell;
        this.inPrice = inPrice;
        for (int j=0; j < inSell.length && j < inPrice.length; j++) {
            mapPrice.put(inSell[j], inPrice[j]);
        }
    }

    public void sell(String[] productList) {
        int counter = 0;
        for (int k=0; k < inSell.length; k++) {
           for (int i=0; i < productList.length; i++) {
               if (inSell[k].equals(productList[i])) {
                   counter++;
                   mapItem.put(inSell[k], counter);
               }
           }
            counter = 0;
        }

        for (Map.Entry<String,Integer> set : mapItem.entrySet()) {
            String shopName = getClass().getSimpleName();
            stock.send(set.getValue(), shopName, set.getKey());
        }

        int summ = 0;
        for (Map.Entry<String,Integer> setItem : mapItem.entrySet()) {
            for (Map.Entry<String,Integer> setPrice : mapPrice.entrySet()) {
                if (setItem.getKey().equals(setPrice.getKey())) {
                    summ = summ + (setItem.getValue() * setPrice.getValue());
                }
            }
        }

        double saleSumm = doDiscount(summ);
        System.out.println("Сумма покупки: " + (summ - saleSumm));
    }

    double doDiscount(int summ) {
        int quantity = 0;
        double saleSumm = 0;
        for (Map.Entry<String,Integer> setItem : mapItem.entrySet()) {
            quantity = quantity + setItem.getValue();
        }
        if (quantity > 4) {
            saleSumm = summ * 0.1;
        } else {
            saleSumm = summ;
        }
        return saleSumm;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
