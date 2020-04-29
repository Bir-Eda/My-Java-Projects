package sixteeniteratorpackage;

import java.util.HashMap;
import java.util.Iterator;

public class FirstHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hm= new HashMap<>();
        hm.put("Java", "is");
        hm.put("always", "fun");
        hm.put("still", "fun");
        System.out.println(hm);
        Iterator<String> iter =hm.keySet().iterator();
        String key;
        while(iter.hasNext()){
            key=iter.next();
            System.out.println(key+"\t"+hm.get(key));
        }
    }
}
