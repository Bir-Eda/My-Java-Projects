package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutHalfIntArrayT {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < list.size() / 2; i++) {
            left.add(list.get(i));
        }
        System.out.println(left + "\t");
        for (int i = list.size() / 2; i < list.size(); i++) {
            right.add(list.get(i));
        }
        System.out.println(right + "\t");
    }
}