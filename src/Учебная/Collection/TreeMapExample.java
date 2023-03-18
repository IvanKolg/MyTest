package Учебная.Collection;

import java.util.Comparator;
import java.util.TreeMap;
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Karen","Manukyan", 4);
        Student st2 = new Student("Ilya","Samorodov", 1);
        Student st3 = new Student("Ivan","Kolganov", 3);
        Student st4 = new Student("Dima","Kamesh", 2);
        Student st5 = new Student("Maxim","Solomnikov", 3);
        Student st6 = new Student("Nikita","Vilegjanin", 1);
        Student st7 = new Student("Nikolay","Smolin", 4);
        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st6);
        treeMap.put(9.1, st7);


//        Student st8 = new Student("Nikolay","Smolin", 4);
//        System.out.println(treeMap.containsKey(st8));
//        System.out.println(treeMap.tailMap(7.3));
//        System.out.println(treeMap.get(6.4));
//        treeMap.remove(5.8);
//        System.out.println(treeMap);
    }

}
