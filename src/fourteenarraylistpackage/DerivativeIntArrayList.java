package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class DerivativeIntArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>(Arrays.asList(4, 6, 9, 2));
        derivate(obj);

    }

    public static void derivate(ArrayList<Integer> list) {
        ArrayList<Integer> myNew = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            myNew.add(Math.abs(list.get(i - 1) - list.get(i)));

        }
        System.out.println(myNew);
    }
}