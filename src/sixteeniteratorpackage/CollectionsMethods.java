package sixteeniteratorpackage;
import java.util.*;

public class CollectionsMethods {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(6);
        Collections.addAll(fruits, "Pear", "Plum", "Apple","Orange", "Strawbery","Banana");
        Collections.sort(fruits, Comparator.reverseOrder());
        Iterator<String> listIter=fruits.iterator();
        while(listIter.hasNext()){
            System.out.println(listIter.next());
        }
    }

}
