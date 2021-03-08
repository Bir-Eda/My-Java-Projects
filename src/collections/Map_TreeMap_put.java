package collections;

import java.util.Iterator;
import java.util.TreeMap;

public class Map_TreeMap_put {
    public static void main(String[] args) {
        TreeMap<String,Integer> lhm=new TreeMap<>();
        lhm.put("Ankara",6);
        lhm.put("Istanbul",34);
        lhm.put("Sakarya",54);
        lhm.put("Adana",1);
        lhm.put("Istanbul",31);
        lhm.put("Agri",6);

        //lhm.put(null,3); ** no null key
        System.out.println("TreeMap maintains ascending order and does not allow duplicate key");
        System.out.println(lhm);

        Iterator<String> iterator=lhm.keySet().iterator();
        while(iterator.hasNext()) {
            String k = iterator.next();
            System.out.println(k + " =" + lhm.get(k));

        }
            Iterator<Integer> iterator2=lhm.values().iterator();
            while(iterator2.hasNext()){
                int k=iterator2.next();
                System.out.println(k);


            }
        System.out.println("size is : "+lhm.size());
    }
}
