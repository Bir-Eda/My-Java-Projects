package interview_questions;

import java.util.ArrayList;

public class PrintOddandEvenNumbersinArray {
    public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);

            } else {
                odd.add(arr[i]);
            }
        }
        //System.out.println(even);
        // System.out.println(odd);

       // System.out.println(printEvenandOdd(arr));
        printEvenandOdd2(arr);
    }

    public static String printEvenandOdd(int arr[]) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        return "Even numbers: " + even + "\nOdd numbers: " + odd;

    }

    public static void printEvenandOdd2(int arr[]) {
        for (int even : arr) {
            if (even % 2 == 0) {
                System.out.print(even);
            }
        }
        for (int odd : arr) {
            if (odd % 2 != 0) {
                System.out.println(odd);
            }
        }

    }
}
