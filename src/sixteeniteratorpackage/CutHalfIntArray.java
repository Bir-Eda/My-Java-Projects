package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class CutHalfIntArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1,2,5,6,7,8,1,2,4,5));
        ArrayList<Integer> half=new ArrayList<>();
        for(int i=0; i<arr.size()/2; i++){
            half.add(arr.get(i));
        }
        System.out.println(half);
    }
}
