package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class InitializeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myArr= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list=new ArrayList<Integer>(List.of(6,7,8,9,10));
        System.out.println(myArr);
        System.out.println(list);
    }
}
