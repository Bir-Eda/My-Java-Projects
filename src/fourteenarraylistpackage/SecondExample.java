package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;


public class SecondExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> second=new ArrayList<>();
        ArrayList<Integer> a= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(a);
        second.add(a);
        System.out.println(second);
        second.add(a);

    }
}
