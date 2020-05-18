package finalreview;
import java.util.*;
import java.util.HashMap;

public class OddIntegerThird {
    public static void main(String[] args) {
        int[]a={1,2,2,2,2,3,3};
        findOdd(a);
    }
    public static int findOdd(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }
        int result=0;
        for (int a : hm.values()) {
            if (a % 2 != 0) {
                result=hm.get(a);
            }
        }
        return result;
    }
}

