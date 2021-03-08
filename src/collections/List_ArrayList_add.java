package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ArrayList_add {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(5);

        System.out.println(list);
        System.out.println("Arraylist keeps insertion order, and allows duplicate values");
//        Iterator itr=list.iterator();
//        while(itr.hasNext());
//        itr.next();
//        System.out.println();


        int arr[]={3,7,1,9,5,0,3,2,1,8};
        List<Integer> aList=new ArrayList<>();
        for(int a:arr){
            aList.add(a);
        }
        aList.forEach(System.out::print);


    }
}
