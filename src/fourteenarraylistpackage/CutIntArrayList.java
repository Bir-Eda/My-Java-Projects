package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class CutIntArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
       ArrayList<Integer> half=new ArrayList<>();
        for(int i=0; i<arr.size()/2; i++){
            half.add(arr.get(i));
        }
        System.out.println(half);
    }
}
