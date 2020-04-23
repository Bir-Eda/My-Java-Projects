package sixteeniteratorpackage;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Enumeration;

public class RemoveWithIteration {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> num = new Hashtable<>(20);
        for(int i=0; i<11; i++) {
            num.put(i, i * 2);
        }
        System.out.println(num);
        Enumeration<Integer> iter=num.keys();

        while(iter.hasMoreElements()){
            Integer key=iter.nextElement();
            if(key>7){
                num.remove(key);
            }
        }
        System.out.println(num);
    }
}
