package eighteenrecursionpackage;

import java.util.Arrays;

public class InsertionSortFirst {
    public static void main(String[] args) {
        int A[] = {5, 4, 8, 1, 2};
        insertionSort(A);
        System.out.println(Arrays.toString(A));
    }

    public static void insertionSort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int value = num[i];
            int j = i - 1;
            while (j >= 0 && num[j] > value) {
                num[j + 1] = num[j];
                j = j - 1;
            }
            num[j + 1] = value;
        }
    }
}
