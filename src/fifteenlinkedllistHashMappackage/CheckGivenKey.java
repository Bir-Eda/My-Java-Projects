package fifteenlinkedllistHashMappackage;

import java.util.HashMap;

public class CheckGivenKey {
    public static void main(String[] args) {
        // myHashMap
        HashMap<String, String> first = new HashMap<>();  // first
        first.put("a","A");
        first.put("b","B");
        for (String key : first.keySet()) {
            System.out.println(key);
        }
        for (String values : first.values()) {
            System.out.println(values);
        }
        // printing keys and values
        for (String key : first.keySet()) {
            System.out.println("key :\t" + key + ", value :\t" + first.get(key));
        }

        System.out.println("------------");
        for (String key : first.keySet()) {  //  myHashMap
            System.out.println("key :\t" + key + ", value :\t" + first.get(key));
        }
    }

}
