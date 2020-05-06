package eighteenrecursionpackage;

import java.util.Arrays;

public class InsertionSortSecond {
    public static void main(String[] args) {
        int num[]={5,4,1,8,2};
        insertionSort(num);
    }
    public static void insertionSort(int []arr){
        int temp;
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr));
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
