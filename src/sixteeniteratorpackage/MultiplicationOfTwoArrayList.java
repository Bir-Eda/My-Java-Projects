package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationOfTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 5, -3,8));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5, 11, 123, 1));
        ArrayList<Integer> multply= new ArrayList<>();
        for(int i=0; i<arr1.size(); i++){
            multply.add(arr1.get(i)*arr2.get(i));
        }
        System.out.println(multply);
    }
}
