package sixteeniteratorpackage;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> grades = new TreeMap<>();
        grades.put("Ali", 100);
        grades.put("Veli", 100);
        grades.put("Kirk", 100);
        grades.put("Dokuz", 100);
        grades.put("Elli", 100);
        grades.put("Eda", 100);
        Iterator<String> iter=grades.keySet().iterator();
    while(iter.hasNext()){
        String key=iter.next();
        System.out.println(key+" = "+grades.get(key));
    }
    }
}
