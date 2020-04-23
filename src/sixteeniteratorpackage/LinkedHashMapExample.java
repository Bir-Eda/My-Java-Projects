package sixteeniteratorpackage;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Iterator;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> pairs= new TreeMap<>(Collections.reverseOrder());
        pairs.put(2,"skfgB");
        pairs.put(1,"Ajdhdg");
        pairs.put(3,"wiryC");
        System.out.println(pairs);

    }

}
