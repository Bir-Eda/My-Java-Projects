package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayListStringRandom {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList());
        String[] myWords = {"heyyy", "klmnb", "nhbgd","osman", "haydi"};
       // ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arr.add((myWords)[(int) (Math.random() * 5)]);
        }
        System.out.println(arr);
    }
}
