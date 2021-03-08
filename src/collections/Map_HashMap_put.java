package collections;

import java.util.HashMap;

public class Map_HashMap_put {
    public static void main(String[] args) {
        HashMap<String,Integer> lhm=new HashMap<>();
        lhm.put("Ankara",6);
        lhm.put("Istanbul",34);
        lhm.put("Sakarya",54);
        lhm.put("Adana",1);
        lhm.put("Ankara",10);
        System.out.println("HashMap does not maintain any order, does not allow duplicate value");
        System.out.println(lhm);
    }
}
