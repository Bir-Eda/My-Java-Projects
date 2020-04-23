package sixteeniteratorpackage;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht=new Hashtable<>();
        String str = " one two three four five six seven eight nine";
        String[] strArray = str.split(" ");
        for(int i=0; i<strArray.length; i++){
            ht.put(i, strArray[i]);
        }
        System.out.println(ht);
        System.out.println("-----------");
        ht.put(0, "Zero");
        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3, "three");
        ht.put(4, "four");
        ht.put(5,"five");
        ht.put(6,"six");
        ht.put(7,"seven");
        ht.put(8,"eight");
        ht.put(9,"nine");
       // System.out.println(ht);
        System.out.println("-----------");
        Set<Integer>keys =ht.keySet();
        Iterator<Integer> iter=keys.iterator();
        int key;
        while(iter.hasNext()){
            key=iter.next();
            System.out.println(key+" = "+ht.get(key));
        }
    }
}
