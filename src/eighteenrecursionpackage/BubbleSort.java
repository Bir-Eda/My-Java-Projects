package eighteenrecursionpackage;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {4, 7, 2, 9, 6};
        bubbleSort(nums);
        System.out.println(Arrays.toString(bubble_Sort(nums)));
    }
    public static void bubbleSort(int arr[]){
        int temp;
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("PASS"+(i+1));
            System.out.println(Arrays.toString(arr));
            for (int j = 0; j < arr.length-1 ; j++) {
                System.out.print(arr[j]+">"+arr[j+1]+"="+(arr[j]>arr[j+1]));
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.print("  arr:" + Arrays.toString(arr)+"\t");
            }
            System.out.println();
        }
    }
    public static int[] bubble_Sort(int arr[]){
        int temp;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    //then swap
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
//for (i = 0; i < n-1; i++)      for (j = 0; j  arr[j+1])
       // swap(arr[j], arr[j+1]);