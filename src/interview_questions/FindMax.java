package interview_questions;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int arr[] = {2, 67, 12, 9, 34, 98, 7};
        //System.out.println(maxNum(arr));
        //System.out.println(largest(arr));
        //System.out.println(minNum(arr));
        //System.out.println(maxSayi(arr));
//        System.out.println(maxNbr(arr));
       // System.out.println(minNbr(arr));


    }

    public static int maxNum(int array[]) {
        int max = 0;
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    // second method
    public static int largest(int num[]) {
        Arrays.sort(num);
        //return num[num.length-1];   //  en buyugu veriyor
        //return num[0];   // en kucugu veriyor
        return num[num.length/2];  // tam ortasini verdi
    }

    public static int maxSayi(int num[]){
        int max=0;
        for(int i=0; i<num.length; i++){
            if(num[i]>max){
                max=num[i];
            }

            }
        return max;
        }

       public static int maxNbr(int arr[]){
        int max=0;
           for (int i = 0; i <arr.length; i++) {
               if(arr[i]>max){
                   max=arr[i];
               }

           }
        return max;

       }
       public static int minNbr(int arr[]){
        Arrays.sort(arr);
        return arr[0];
       }




    }































