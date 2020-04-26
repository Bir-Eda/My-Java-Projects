package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(10, 11, 12));
        System.out.println(combineArrayList(arr1, arr2));
    }
    public static ArrayList<Integer> combineArrayList(ArrayList<Integer>left, ArrayList<Integer> right){
        ArrayList<Integer> result=new ArrayList<>();
        result.addAll(left);
        result.addAll(right);
        return result;
    }
}
