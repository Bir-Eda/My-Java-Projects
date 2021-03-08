package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet_add {
    public static void main(String[] args) {
        int arr[] = {4, 8, 9, 2, 0, 4, 2, 4, 2,7};
        Set<Integer> set = new LinkedHashSet<>();
        for (int a : arr) {
            set.add(a);
        }
        System.out.println("\n"+"LinkedHashSet keeps intertion order and does not duplicate values");
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+ " ");

        }
        System.out.println("\n"+"Set size is : "+set.size());
    }
}
