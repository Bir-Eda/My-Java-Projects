package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Kahoot {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<Integer>();
        ArrayList<Integer>list2=new ArrayList<Integer>(20);
        list1.addAll(Arrays.asList(1,2,3,4,5,5,6,7,8,9,10));
        ArrayList<Integer>list3=new ArrayList<Integer>();

        System.out.println(list1.get(list1.set(0,10)));
        System.out.println(list1.get(0));
        System.out.println(list3.get(0));
        System.out.println(list2.get(10));
    }
}
