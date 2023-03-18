package Proect;


import java.util.*;

public class Database {
    Map<String,List<String>> mapWormCntryHotel = new HashMap<>();
    Map<String,Integer> mapWormHotelPrice = new HashMap<>();
    Map<String,List<String>> mapColdCntryHotel = new HashMap<>();
    Map<String,Integer> mapColdHotelPrice = new HashMap<>();
    List<String> hotels = new ArrayList<>();
    public Database() {
        createmapWormCntryHotel();
        createmapWormHotelPrice();
        createmapColdCntryHotel();
        createmapColdHotelPrice();
    }
    public void createmapWormCntryHotel() {
        mapWormCntryHotel.put("Turkey", List.of("Cezar","Radison"));
        mapWormCntryHotel.put("Egypt", List.of("Egypthotel1","Egypthotel2"));
        mapWormCntryHotel.put("Bali", List.of("Balihotel1","Balihotel2"));
        mapWormCntryHotel.put("Vietnam", List.of("Vietnamhotel1","Vietnamhotel2"));
        mapWormCntryHotel.put("India", List.of("Indiahotel1","Indiahotel2"));
        mapWormCntryHotel.put("Spain", List.of("Spainhotel1","Spainhotel2"));
//        Set<Map.Entry<String,List<String>>> set = mapWormCntryHotel.entrySet();
//        for (Map.Entry<String,List<String>> my : set) {
//            System.out.println(my.getValue());
//        }
    }
    public void createmapWormHotelPrice() {
        mapWormHotelPrice.put(methodWorm("Turkey",0),3000);
        mapWormHotelPrice.put(methodWorm("Turkey",1),5000);
        mapWormHotelPrice.put(methodWorm("Egypt",0),4000);
        mapWormHotelPrice.put(methodWorm("Egypt",1),2000);
        mapWormHotelPrice.put(methodWorm("Bali",0),6000);
        mapWormHotelPrice.put(methodWorm("Bali",1),3500);
        mapWormHotelPrice.put(methodWorm("Vietnam",0),1800);
        mapWormHotelPrice.put(methodWorm("Vietnam",1),2700);
        mapWormHotelPrice.put(methodWorm("India",0),3100);
        mapWormHotelPrice.put(methodWorm("India",1),2900);
        mapWormHotelPrice.put(methodWorm("Spain",0),4500);
        mapWormHotelPrice.put(methodWorm("Spain",1),8000);
    }
    public void createmapColdCntryHotel() {
        mapColdCntryHotel.put("England", List.of("Englandhotel1","Englandhotel2"));
        mapColdCntryHotel.put("Germany", List.of("Germanyhotel1","Germanyhotel2"));
        mapColdCntryHotel.put("Sweden", List.of("Swedenhotel1","Swedenhotel2"));
        mapColdCntryHotel.put("Russia", List.of("Russiahotel1","Russiahotel2"));
        mapColdCntryHotel.put("Canada", List.of("Canadahotel1","Canadahotel2"));
    }
    public void createmapColdHotelPrice() {
        mapColdHotelPrice.put(methodCold("England",0),9000);
        mapColdHotelPrice.put(methodCold("England",1),7000);
        mapColdHotelPrice.put(methodCold("Germany",0),8200);
        mapColdHotelPrice.put(methodCold("Germany",1),6800);
        mapColdHotelPrice.put(methodCold("Sweden",0),9400);
        mapColdHotelPrice.put(methodCold("Sweden",1),10500);
        mapColdHotelPrice.put(methodCold("Russia",0),3000);
        mapColdHotelPrice.put(methodCold("Russia",1),5000);
        mapColdHotelPrice.put(methodCold("Canada",0),5800);
        mapColdHotelPrice.put(methodCold("Canada",1),6300);
    }
    private String methodWorm(String country, int index) {
        return mapWormCntryHotel.get(country).get(index);
    }
    private String methodCold(String country, int index) {
        return mapColdCntryHotel.get(country).get(index);
    }


}
