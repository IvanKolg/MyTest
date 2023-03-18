package СКУПКА;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lombard lombard = new Lombard();
        lombard.odinTovar("gr");
        System.out.println(lombard.map.get("gr 0"));
    }

}
