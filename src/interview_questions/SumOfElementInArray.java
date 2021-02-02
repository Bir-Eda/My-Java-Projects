package interview_questions;

import java.util.Scanner;

public class SumOfElementInArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter array size numbers :"+" ");
        int n=scan.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= scan.nextInt();

        }
        System.out.println(sum(arr));




        // burasi ilk cozum
//        int arr[]={2,3,7,4,9};
//        int sum=0;
//        for (int i=0; i<=arr.length; i++){
//            sum+=arr[1];
//
//        }
//        System.out.println(sum);

    }
    public static int sum(int []arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];

        }
        return sum;

    }

}
