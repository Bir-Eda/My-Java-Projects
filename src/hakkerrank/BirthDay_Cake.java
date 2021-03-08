package hakkerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthDay_Cake {
    public static void main(String[] args) {
        int[] array = {4, 6, 9, 9,9};
        System.out.println(candle(array));
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,4,4));
        System.out.println(candleList(list));
    }

    public static int candle(int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        for (int a : arr) {
            if (a == max) {
                count++;
            }
        }
        return count;
    }


    public static int candleList(List<Integer> arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= max) {
                max = arr.get(i);
            }

        }
        for (int a : arr) {
            if (a == max) {
                count++;
            }
        }
        return  count;
    }
}
