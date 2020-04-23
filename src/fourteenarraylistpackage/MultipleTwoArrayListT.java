package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleTwoArrayListT {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, -3));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(10, 11, 12));
        System.out.println(returnMulty(arr1, arr2));

    }


    public static ArrayList<Integer> returnMulty(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < first.size(); i++) {
            result.add(first.get(i) * second.get(i));

        }
        return result;
    }
}
