package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(7, 8, 9, 10, 11, 12));
        System.out.println(multiplyArrays(arr1, arr2));

    }

    public static ArrayList<Integer> multiplyArrays(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer> multiply = new ArrayList<>();
        for (int i = 0; i < array1.size(); i++) {
            multiply.add(array1.get(i) * array2.get(i));
        }
        return multiply;
    }
}



