package interview_questions;

import java.util.Arrays;

public class TwoArraysEqualOrNot {
    public static void main(String[] args) {
        int arr1[]= {1,2,3};
        int arr2[]= {1,2,5};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
       // System.out.println("The arrays are : " + arrEqual(arr1, arr2));
        System.out.println("The arrays are : " + areEqual(arr1, arr2));

        }
        public static boolean arrEqual(int []arr1, int arr2[]){
        boolean status =true;
        if(arr1.length==arr2.length){
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]!=arr2[i]){
                    status = false;
                }
            }
        }
        else if(arr1.length!=arr2.length){
            status=false;
        }


        return status;
    }
    public static boolean areEqual(int arr1[], int arr2[]){
        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        return false;
    }
}



















