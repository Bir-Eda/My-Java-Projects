package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Deneme2 {
    public static void main(String[] args) {
        ArrayList<Integer> myObj = new ArrayList<>(Arrays.asList(4, 8, 2, 1));
        deriv(myObj);
    }

    public static void deriv(ArrayList<Integer> list) {
        ArrayList<Integer> number = new ArrayList<>();
        int counter;
        for (int i = 0; i < list.size() - 1; i++) {
            counter = list.get(i) - list.get(i + 1);
            number.add(counter);
        }
        System.out.println(number);
    }
}
