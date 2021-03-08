package interview_questions.overloading_overriding;

import ocaquestionsvp2.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AllExamples {
    public static void main(String[] args) {
        int array[] = {8, 2, 17, 5,3,1,89,34};
//        System.out.println(maxN1(array));
//        System.out.println(minN2(array));
//        System.out.println(minimumN3(array));
//        System.out.println(isPrime4(81));
//        System.out.println(reverseS5("Honey"));
//        System.out.println(palindrome6("Madam"));

      //  evenAndOd(array);
      //  createRandomN(3);
      //  factorial(3);
      //  factoriii(3);
       // System.out.println(fibonacci(7));

        // palindrome sorusu
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(A.equalsIgnoreCase(new StringBuilder(A).reverse().toString())

                ? "Yes" : "No");

    }
    public static void evenAndOd(int arr[]){
            ArrayList<Integer> even=new ArrayList<>();
            ArrayList<Integer> odd=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else{
                if(arr[i]%2!=0){
                    odd.add(arr[i]);
                }
            }

        }
        System.out.println("even : "+even+", odd "+odd);
    }

    public static int maxN1(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;

    }
    public static int minN2(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    public static int minimumN3(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        return min;
    }
    public static boolean isPrime4(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String reverseS5(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
    public static boolean palindrome6(String str) {
        String str1 = str.toLowerCase();
        if (str1.equals(new StringBuilder(str1).reverse().toString())) {
            return true;
        }
        return false;
    }

    public static void createRandomN(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 4000 + 1000);
            System.out.println(arr[i]);
        }
    }
    public static void factorial(int arr){
        int fact=1;
        for (int i = 1; i <=arr; i++) {
            fact=fact*i;

        }
        System.out.println(arr+" number of factorial is : "+fact);
    }
    public static int fibonacci(int num){
        if(num<=1){
            return num;
        }
        else{
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
    public static void factoriii(int num){
        int fact=1;
        for (int i = 1; i <=num ; i++) {
            fact=fact*i;

        }
        System.out.println(num+" "+fact);
    }
}














