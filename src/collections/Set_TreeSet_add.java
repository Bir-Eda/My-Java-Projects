package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet_add {
    public static void main(String[] args) {
        String arr[]={"hey ", "some ", "two ", "bee ", "lion ", "two "};
        Set<String> tSet= new TreeSet<>();
        for (String words:arr){
            tSet.add(words);
        }

        Iterator iterator=tSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\n");
        }
//        tSet.forEach(System.out::print);  //  iterator icin ikinci formul



        int array[]= {2,8,3,0,1,4,6,0,3,2};
        Set<Integer> intSet= new TreeSet<>();
        for (int num:array) {
            intSet.add(num);
        }

        intSet.forEach(System.out::print);
        System.out.println("\n"+ " TreeSet does not allow duplication and gives Ascending order and it is faster");

    }
}
