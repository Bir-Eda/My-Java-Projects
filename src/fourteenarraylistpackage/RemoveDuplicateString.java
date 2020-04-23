package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList("a", "b", "c", "a", "b"));
        ArrayList<String> newList = new ArrayList<>();
        for (String letter : arr) {
            if (!newList.contains(letter)) {
                newList.add(letter);
            }
        }
        System.out.println(newList);
    }
}