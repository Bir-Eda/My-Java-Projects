package twentyjavastringprocessingrecursionpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SlotMachineArrayList {
    public static void main(String[] args) {
       String array[]={"ab", "ab","ab"};
        System.out.println(isWin(array));
    }

    public static boolean isWin(String[] arr){
        HashSet<String> hs =new HashSet<>();
        for (String s:arr){
            hs.add(s);
        }
        return hs.size()==1?true:false;
    }
}
