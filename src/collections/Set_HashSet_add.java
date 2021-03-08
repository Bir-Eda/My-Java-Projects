package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet_add {
    public static void main(String[] args) {
        int arr[]={9,8,2,0,5,1,7,8,5,0,4};
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);

        }
        set.size();
        // System.out.println(set.size()); set`i icine de yazabiliriz
        System.out.println(set); // arrayin size`ini verir

        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");  // HashSet does not allow dublicate and gives ascending order
        }
    }
}
