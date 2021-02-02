package interview_questions;

public class FibonacciSeries {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(fbnccNumber(i)+" ");
        }
    }
    public static int fbnccNumber(int n){
        if(n<=1){
            return n;
        }
        else{
            return fbnccNumber(n-1)+ fbnccNumber(n-2);
        }
    }
}
