package sixteeniteratorpackage;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapCreateElements {
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("Los Angeles", 85);
        hm.put("Boston", 65);
        hm.put("Texas", 97);
        System.out.println(hm);
        Iterator<String> iter =hm.keySet().iterator();
        String key;
        while(iter.hasNext()){
            key=iter.next();
            System.out.println(key+"\t"+hm.get(key));
        }
    }
}
