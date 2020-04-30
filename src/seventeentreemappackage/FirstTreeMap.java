package seventeentreemappackage;

import java.util.Iterator;
import java.util.TreeMap;

public class FirstTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> myMap=new TreeMap<>();
        myMap.put("Ali", 12345);
        myMap.put("Veli", 18345);
        myMap.put("Kirk", 237465);
        myMap.put("Dokuz", 84746);
        myMap.put("Elli", 73635);
        System.out.println(myMap);
        Iterator<String> iter = myMap.keySet().iterator();
        String key;
        while(iter.hasNext()){
            key = iter.next();
            System.out.println(key+"\t=\t"+myMap.get(key));
        }

    }
}
