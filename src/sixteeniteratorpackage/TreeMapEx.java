package sixteeniteratorpackage;
import java.util.Enumeration;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
public class TreeMapEx {
    public static void main(String[] args) {
        java.util.TreeMap<String, Integer> tree = new java.util.TreeMap<>();
        tree.put("Esra", 100);
        tree.put("John", 100);
        tree.put("Vahit", 100);
        tree.put("Shohrat", 100);
        tree.put("Rumeysa", 100);
        tree.put("Melih", 100);
        tree.put("Ali", 100);
        System.out.println(tree);
        Set<String> keys = tree.keySet();
        Iterator<String> iter = keys.iterator();
        String key;
        while (iter.hasNext()) {
            key = iter.next();
            System.out.println(key + " = " + tree.get(key));
        }

    }
}