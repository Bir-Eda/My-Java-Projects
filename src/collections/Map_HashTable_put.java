package collections;

import java.util.Hashtable;
import java.util.Iterator;

public class Map_HashTable_put {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht=new Hashtable<>();

        ht.put("Konya", 10);
        ht.put("Adana",1);
        ht.put("Istanbul",34);
        ht.put("Sakarya",54);
        ht.put("Adana",1);
        ht.put("Ankara",6);
        ht.put("Konya", 20);


        System.out.println("Hashtable does not care order and does not allow duplicate key and value");
        System.out.println(ht);

    }

}
