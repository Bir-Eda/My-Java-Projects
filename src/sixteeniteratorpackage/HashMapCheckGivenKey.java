package sixteeniteratorpackage;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapCheckGivenKey {
    public static void main(String[] args) {
        HashMap<String, String> first = new HashMap<>();
        first.put("D", "d");
        first.put("S", "s");
        first.put("M", "m");
        System.out.println(isKeyHas(first, "A"));
    }
    public  static boolean isKeyHas(HashMap<String,String> hm, String key){
        boolean result=false;
        Iterator<String> iterator = hm.keySet().iterator();
        while(iterator.hasNext()){
            if (key.equals(iterator.next())){
                result = true;
            }
        }
        return result;
    }
}
