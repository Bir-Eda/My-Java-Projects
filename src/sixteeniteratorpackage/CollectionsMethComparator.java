package sixteeniteratorpackage;
import java.util.*;

public class CollectionsMethComparator {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 51; i++) {
            num.add(rand.nextInt(100));
        }
        System.out.println((num));
        Collections.sort(num);
        System.out.println(num);
        Collections.sort(num, Comparator.reverseOrder());
        System.out.println(num);
        Iterator<Integer> iter = num.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        /* copy method
        LinkedList<Integer> emptyList = new LinkedList<Integer>();
        Collections.copy(emptyList, num);
        System.out.println(emptyList);
        */



    }

    /*public static void copy() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> numbersCopy = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 6));
        Collections.copy(numbersCopy, numbers);
        System.out.println(numbersCopy);
    } */
}

