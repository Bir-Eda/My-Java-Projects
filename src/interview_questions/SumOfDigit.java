package interview_questions;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 12345;
       System.out.println(sum(n));
        int num=23;

    }

    public static int sum(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;

        }
        return sum;
    }


}
