package interview_questions;

public class HR_BigSum {
    public static void main(String[] args) {
    double array[]={1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        System.out.println(bigSum(array));
    }
    public static double bigSum(double [] arr){
        double result=0;
        if(arr.length>=0 && arr.length<=10){
    for(int i=0; i<arr.length; i++){
        if(arr[i]>=0 && arr[i]<=Math.pow(10,10)){
            result=result+arr[i];
        }
    }
        }
        return result;
    }
}
