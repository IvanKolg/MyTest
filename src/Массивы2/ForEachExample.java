package Массивы2;

import Stores.Stock;

public class ForEachExample {
    public static void main(String[] args) {
//        int[] sample = new int[4];
//
//        System.out.println("do foreach");
//
//        for (int t: sample) {
//            System.out.println(t);
//        }
//        // !!!
//        for (int i=0;i<sample.length; i++) {
//            sample[i]=99;
//        }
//
//        System.out.println("posle foreach");
//        for (int t:sample) {
//            System.out.println(t);
//        }
        Stock stock = new Stock();
        stock.send(1, "Apple", "tv");

    }


}
