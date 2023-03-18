package СКУПКА;

import java.text.SimpleDateFormat;
import java.util.*;

public class Lombard {
    List<String> list = new ArrayList<>();
    public Map<String, String> map = new HashMap<>();
    long iD = 0;
    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date = new Date();
    public void odinTovar(String tovar) {
        list.add(tovar);
        map.put(tovar + " " + iD,  " " + formater.format(date));
        iD++;
    }
    public void listTovarov(List<String> list) {
        list.addAll(list);
    }
    public void delete(String tovar) {
        list.remove(tovar);
    }
    public String find(String tovar) {
        int index = Integer.parseInt(tovar);
        return list.get(index);
    }

//    public static void main(String[] args) {
//        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date();
//
//        System.out.println(formater.format(date));
//    }
}
