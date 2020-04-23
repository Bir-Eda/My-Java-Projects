package fifteenlinkedllistHashMappackage;
import java.util.HashMap;
public class HMFirstHashMap {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>(); // myHashMap
        HashMap<String, Integer> first = new HashMap<>();  // first
        myHashMap.put("Java", "medium");
        myHashMap.put("SQL", "entry");
        myHashMap.put("Selenium", "masster");
        myHashMap.put("Cucumber", "expert");

        System.out.println(first);
        first.put("Java", 100);
        System.out.println(first);
        first.put("Selenium", 99);
        System.out.println(first);
        System.out.println(first.get("Selenium"));
        System.out.println(first.size());
        // printing the keys
        for (String key : first.keySet()) {
            System.out.println(key);
        }
        // printing values
        for (int values : first.values()) {
            System.out.println(values);
        }
        // printing keys and values
        for (String key : first.keySet()) {
            System.out.println("key :\t" + key + ", value :\t" + first.get(key));
        }

        System.out.println("------------");
        for (String key : myHashMap.keySet()) {  //  myHashMap
            System.out.println("key :\t" + key + ", value :\t" + myHashMap.get(key));
        }
    }
}


