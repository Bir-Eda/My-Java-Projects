package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStringArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList("array", "constructor", "extends", "implement", "overriding"));
        ArrayList<String> newList = new ArrayList<>();
        for(int i=0; i<arr.size()-1; i++){
            System.out.print((arr.get((arr.size()-1)-i).toString()));

        }
        System.out.println();
       for (String letter : arr) {
            if (!newList.contains(letter)) {
                newList.add(letter);
            }
        }
        System.out.println(newList);

    }
}