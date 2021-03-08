package collections;

import java.util.LinkedHashMap;

public class Map_LinkedHashMap_put {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("Ankara",6);
        lhm.put("Istanbul",34);
        lhm.put("Sakarya",54);
        lhm.put("Adana",1);
        lhm.put("Sakarya",54);
        lhm.put("Adana",10);
        lhm.put("Izmir",34);


        System.out.println("LinkedHashMap gives insertion order and does not allow duplicate key");
        System.out.println(lhm);
    }
}
