package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateNum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 5, 7, 3, 2, 4, 8, 3, 2));
        ArrayList<Integer> newList = new ArrayList<>();
        for (int number : arr) {
            if (!newList.contains(number)) {
                newList.add(number);
            }

        }
        System.out.println(newList);
    }
}
