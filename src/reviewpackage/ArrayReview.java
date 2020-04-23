package reviewpackage;

public class ArrayReview {
    public static void main(String[] args) {
        int arr[]=new int [50];
        int arr2[]=new int[100];
        arr=arr2;
        System.out.println(arr[99]);
    }

}
