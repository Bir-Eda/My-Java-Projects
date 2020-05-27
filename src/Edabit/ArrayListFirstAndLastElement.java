package Edabit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListFirstAndLastElement {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("Veli","Ali","Yusuf","Cem"));
        names.set(0,"Can");
        System.out.println(names);
        int i=0;
        int j=names.size()-1;
        while(i<j){
            String temp=names.get(i);
            names.set(i,names.get(j));
            names.set(j,temp);
            j++;
            j--;

        }
        System.out.println(names);
    }

}
