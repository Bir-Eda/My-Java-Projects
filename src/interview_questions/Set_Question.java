package interview_questions;

import java.util.*;

public class Set_Question {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();  //  LinkedHashSet olunca yazdigimiz siraya gore order yazdirir.insertion order
       // TreeSet de kucukten buyuge sorted order

        // List<Integer> list = new ArrayList<>();
      //  Collection<Integer> list2 = new ArrayList<>();
        set.add(9);
        set.add(1);
        set.add(6);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println(set);

        int index=0;
        for (int i : set) {
            if(index==2)
            System.out.println(i + " ");
            index++;

        }
        System.out.println("\n--------------");

        Iterator<Integer> iter = set.iterator();
        iter.next();
        iter.next();
        int n = 0;
        while (iter.hasNext()) {
            int key = iter.next();

            if (n == 2) {

                System.out.println(key);

            }
            n++;
        }

    }
}
