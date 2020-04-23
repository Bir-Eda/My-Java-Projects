package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Deneme {
    public static void main(String[] args) {
        ArrayList<String> myArr= new ArrayList<>(Arrays.asList("asdfg","hhjjkl"));
        String arr[]=convert(myArr);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static String[] convert(ArrayList<String> arr) {
        String array[] = new String[arr.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr.get(i);
        }
        return array;
    }
}

