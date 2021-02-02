package interview_questions;

import java.util.Arrays;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int arr[] = {2, 7, 12, 89, 3};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(min2(arr));
        System.out.println(min3(arr));

    }

    public static int max(int arr[]) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;

            }

        }
        return max;
    }

    public static int min(int arr[]) {
        int min = 12;
        for (int num : arr) {
            if (num < min) {
                min = num;

            }
        }
        return min;

    }
    public static int min2(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int min3(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


}
