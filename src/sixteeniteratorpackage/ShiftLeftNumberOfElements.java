package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.List;

public class ShiftLeftNumberOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> myArr= new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(shiftLeftNumberOfElements(myArr, 2));
    }
    public static ArrayList<Integer> shiftLeftNumberOfElements(ArrayList<Integer>arr, int shift){
        for(int i=0; i<arr.size(); i++){
            arr.remove(0);
        }
        return arr;
    }
}
