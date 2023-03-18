package Proect;

import java.util.*;

public class CountryChoice {
    Database database = new Database();
    String act = "Активный";
    int summ;
    boolean isActiveRest;
    int totalAmount;
    int days;
    boolean needFlight;

    public CountryChoice(boolean isActiveRest, int totalAmount, int days, boolean needFlight) {
        this.isActiveRest = isActiveRest;
        this.totalAmount = totalAmount;
        this.days = days;
        this.needFlight = needFlight;
    }
    public boolean choiceRest(String choice) {
        if (choice.equals("Активный")) {
            return true;
        } else  {
            return false;
        }
    }
    public void totalAmont() {
//        database.mapWormHotelPrice.values();
        Map<String,Integer> listPricewrm = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> my2 : database.mapWormHotelPrice.entrySet()) {
                listPricewrm.put(my2.getKey(), my2.getValue() * days);
        }
        listPricewrm.entrySet().forEach(i -> System.out.println(i.getKey() +": "+ i.getValue()));

        Map<String,Integer> listPricecold = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> cold2 : database.mapColdHotelPrice.entrySet()) {
            listPricecold.put(cold2.getKey(), cold2.getValue() * days);
        }
        listPricecold.entrySet().forEach(j -> System.out.println(j.getKey() +": "+ j.getValue()));
    }
    public boolean needFlight() {
        if (needFlight = true) {
            int i = totalAmount + polet();
        }
        return false;
    }

    public int polet() {
        return 5000;
    }
}
