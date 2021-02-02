package interview_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class MinArray {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(2, 4, 11, 13, 6, 7, 8));
        System.out.println(returnMax(x));
    }

    // find max value
    public static int returnMax(ArrayList<Integer> array) {
        int max = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }

        }
        return max;
    }


}
